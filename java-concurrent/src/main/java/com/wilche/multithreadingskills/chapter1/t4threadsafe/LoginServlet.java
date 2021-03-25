package com.wilche.multithreadingskills.chapter1.t4threadsafe;

/**
 * 非线程安全
 * <p>
 * 主要指多个线程对同一个对象中的同一个实例变量进行操作时会出现值的更改、值不同步的情况，进而影响到程序的执行流程。
 *
 * @author caoweiquan
 * @date 2021/3/19
 */
public class LoginServlet {

    private static String usernameRef;
    private static String passwordRef;

    public synchronized static void doPost(String username, String password) {
        try {
            usernameRef = username;
            if (username.equals("a")) {
                Thread.sleep(5000);
            }
            passwordRef = password;
            System.out.println("username = " + usernameRef + ",password = " + passwordRef);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
