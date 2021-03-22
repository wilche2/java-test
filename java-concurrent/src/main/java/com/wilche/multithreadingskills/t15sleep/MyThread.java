package com.wilche.multithreadingskills.t15sleep;

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

    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 1000000; i++) {
                System.out.println("i = " + i);
            }

            System.out.println("run begin");
            Thread.sleep(2000000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("先停止，再遇到sleep，进入catch在沉睡中挂了");
            e.printStackTrace();
        }

    }
}
