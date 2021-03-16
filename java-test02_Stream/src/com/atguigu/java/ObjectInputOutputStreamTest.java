package com.atguigu.java;

import org.junit.Test;

import java.io.*;

/**
 * 1. 需要实现接口：Serializable
 * 2. 当前类提供一个全局常量：serialVersionUID
 * 3. 除了当前类需要实现Serializable接口，还必须保证其内部所有属性也必须是可序列化的
 * 4. ObjectOutputStream ObjectInputStream 不能序列化 static 和 transient 修饰的成员变量
 *
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

    /**
     * Person 要想满足如下才可序列化：
     * 1. 需要实现 Serializable（标识接口）
     * 2. 需要提供一个全局常量，serialVersionUID
     */
    @Test
    public void testObjectOutputStream1() {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("object.dat"));
            oos.writeObject("我爱北京，天安门");
            oos.flush();

            oos.writeObject(new Person("wilche", 25));
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
    public void testObjectInputStream1() {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("object.dat"));
            Object o = ois.readObject();
            System.out.println("o = " + o);

            Object o1 = ois.readObject();
            System.out.println("o1 = " + o1);
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
