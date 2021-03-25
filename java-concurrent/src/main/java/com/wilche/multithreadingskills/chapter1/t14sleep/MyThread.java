package com.wilche.multithreadingskills.chapter1.t14sleep;

/**
 * sleep interrupt
 * 先睡再停止
 * <p>
 * sleep状态 调用 interrupt()接口会进去catch
 *
 * @author caoweiquan
 * @date 2021/3/22
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        try {
            System.out.println("run begin");
            Thread.sleep(2000000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("在沉睡中挂了");
            e.printStackTrace();
        }

    }
}
