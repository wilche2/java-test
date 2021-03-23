package com.wilche.multithreadingskills.t21priority_继承性;

/**
 * @author caoweiquan
 * @date 2021/3/23
 */
public class MyThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread1 run priority = " + this.getPriority());
        MyThread2 thread2 = new MyThread2();
        thread2.start();
    }
}
