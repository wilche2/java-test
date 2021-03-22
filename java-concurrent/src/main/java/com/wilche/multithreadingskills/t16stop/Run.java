package com.wilche.multithreadingskills.t16stop;

/**
 * stop 暴力停止
 *
 * @author caoweiquan
 * @date 2021/3/22
 */
public class Run {

    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(1);
            myThread.stop();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end");
    }

}
