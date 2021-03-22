package com.wilche.multithreadingskills.t16stop;

/**
 * sleep interrupt
 * 先 interrupt 再sleep
 * <p>
 * interrupt()接口后再sleep会进去catch
 *
 * @author caoweiquan
 * @date 2021/3/22
 */
public class MyThread extends Thread {

    private int i = 0;

    @Override
    public void run() {
        super.run();
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
