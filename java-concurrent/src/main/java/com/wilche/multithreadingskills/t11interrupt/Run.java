package com.wilche.multithreadingskills.t11interrupt;

/**
 * interrupt 打出一个停止标注，并不是真正的停止线程
 * @author caoweiquan
 * @date 2021/3/22
 */
public class Run {

    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(2000);
            myThread.interrupt();
            System.out.println("myThread.isInterrupted()1 = " + myThread.isInterrupted());
            System.out.println("myThread.isInterrupted()2 = " + myThread.isInterrupted());
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
    }

}
