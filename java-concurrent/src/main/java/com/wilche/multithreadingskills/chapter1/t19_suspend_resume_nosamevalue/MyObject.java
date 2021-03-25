package com.wilche.multithreadingskills.chapter1.t19_suspend_resume_nosamevalue;

/**
 * 容易出现因为线程的暂停而出现线程不一致的情况
 * 打印结果:
 * 停止 a 线程！
 * a 11
 *
 * @author caoweiquan
 * @date 2021/3/22
 */
public class MyObject {

    private String username = "1";
    private String password = "11";

    public void setValue(String username, String password) {
        this.username = username;
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("停止 a 线程！");
            Thread.currentThread().suspend();
        }
        this.password = password;
    }

    public void printUsernameAndPassword() {
        System.out.println(username + " " + password);
    }

}
