package com.wilche.multithreadingskills.t18returninterrupt;

/**
 * @author caoweiquan
 * @date 2021/3/22
 */
public class MyThread extends Thread {

    @Override
    public void run() {

        while (true) {
            if (this.isInterrupted()) {
                System.out.println("停止了");
                return;
            }

            System.out.println("timer = " + System.currentTimeMillis());
        }
    }

}
