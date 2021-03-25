package com.wilche.multithreadingskills.chapter1.t21priority_继承性;

/**
 * @author caoweiquan
 * @date 2021/3/23
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread2 run priority = " + this.getPriority());
        
    }
}
