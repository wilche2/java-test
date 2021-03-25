package com.wilche.multithreadingskills.chapter1.t22daemon_thread;

/**
 * @author caoweiquan
 * @date 2021/3/23
 */
public class MyThread extends Thread {
    private int i = 0;

    @Override
    public void run() {
        try {
            while (true) {
                i++;
                System.out.println("i = " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
