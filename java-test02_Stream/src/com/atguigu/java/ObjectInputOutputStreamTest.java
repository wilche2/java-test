package com.atguigu.java;

import org.junit.Test;

import java.io.*;

/**
 * @author caoweiquan
 * @date 2021/3/15
 */
public class ObjectInputOutputStreamTest {

    /**
     * 序列化过程：将内存中的java对象保存到磁盘中或通过网络传输出去
     * 使用ObjectOutputStream实现
     */
    @Test
    public void testObjectOutputStream() {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("object.dat"));
            oos.writeObject("我爱北京，天安门");
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 反序列化过程：将磁盘文件中的对象还原为内存中的 Java 对象
     */
    @Test
    public void testObjectInputStream() {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("object.dat"));
            Object o = ois.readObject();
            String str = (String) o;
            System.out.println("str = " + str);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
