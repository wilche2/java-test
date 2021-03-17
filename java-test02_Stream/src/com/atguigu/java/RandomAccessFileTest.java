package com.atguigu.java;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 随机存取文件流
 * RandomAccessFile
 * 1. RandomAccessFile 直接继承于 java.lang.Object 类，实现了DataInput和DataOutput接口
 * 2. RandomAccessFile 即可以作为输入流和输出流
 * 3. 如果 RandomAccessFile 作为输出流时，写出到文件如果不存在，则在执行过程中自动创建，
 * 如果写出的文件存在，则会对原先文件内容进行覆盖
 *
 * @author caoweiquan
 * @date 2021/3/16
 */
public class RandomAccessFileTest {

    /**
     * 基本使用
     */
    @Test
    public void test1() {
        RandomAccessFile raf1 = null;
        RandomAccessFile raf2 = null;
        try {
            raf1 = new RandomAccessFile(new File("DeadPikachu.jpg"), "r");
            raf2 = new RandomAccessFile(new File("DeadPikachu1.jpg"), "rw");

            byte[] buffer = new byte[1024];
            int len;
            while ((len = raf1.read(buffer)) != -1) {
                raf2.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (raf1 != null) {
                try {
                    raf1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (raf2 != null) {
                try {
                    raf2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 1. 对文件内容进行覆盖，不追加（对原有的文件进行覆盖）
     * 2. 文件不存在，则新建
     */
    @Test
    public void test2() {
        RandomAccessFile raf1 = null;
        try {
            raf1 = new RandomAccessFile(new File("hello1.txt"), "rw");
            raf1.write("aaaaa".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (raf1 != null) {
                try {
                    raf1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 1. 设置覆盖位置
     * 2. 文件不存在，则新建
     */
    @Test
    public void test3() {
        RandomAccessFile raf1 = null;
        try {
            File file = new File("hello.txt");
            raf1 = new RandomAccessFile(file, "rw");
            raf1.seek(file.length());
            raf1.write("bb".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (raf1 != null) {
                try {
                    raf1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * RandomAccessFile 实现插入的效果，实际还是覆盖
     */
    @Test
    public void test4() {
        RandomAccessFile raf1 = null;
        try {
            raf1 = new RandomAccessFile("hello.txt", "rw");
            raf1.seek(3);
            StringBuilder sb = new StringBuilder((int) new File("hello.txt").length());
            byte[] buffer = new byte[20];
            int len;
            while ((len = raf1.read(buffer)) != -1) {
                sb.append(new String(buffer, 0, len));
            }

            // 调回指针
            raf1.seek(3);
            raf1.write("cc".getBytes());

            raf1.write(sb.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (raf1 != null) {
                try {
                    raf1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
