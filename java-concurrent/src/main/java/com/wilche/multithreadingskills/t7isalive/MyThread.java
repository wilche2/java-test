package com.wilche.multithreadingskills.t7isalive;

/**
 * @author caoweiquan
 * @date 2021/3/19
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("run = " + this.isAlive());
    }
}
