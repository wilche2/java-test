package com.wilche.multithreadingskills.chapter1.t13_1manualinterrupt;

/**
 * 1. interrupt 打出一个停止标注，并不是真正的停止线程
 * 2. interrupted 返回并清除中断状态值
 * 3. isInterrupted 返回中断状态值
 * <p>
 * 主动性逻辑退出，for循环外侧依旧会继续执行逻辑
 *
 * @author caoweiquan
 * @date 2021/3/22
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 50000; i++) {
                if (this.isInterrupted()) {
                    System.out.println("已经是停止状态了，我要退出了");
                    throw new InterruptedException();
                }

                System.out.println("i = " + i);
            }

            System.out.println("我for外面");
        } catch (InterruptedException e) {
            System.out.println("catch InterruptedException");
            e.printStackTrace();
        }
    }
}
