package com.wilche.multithreadingskills.t11interrupt;

/**
 * 1. interrupt 打出一个停止标注，并不是真正的停止线程
 * 2. interrupted 返回并清除中断状态值
 * 3. isInterrupted 返回中断状态值
 *
 * @author caoweiquan
 * @date 2021/3/22
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 50000; i++) {
            System.out.println("i = " + i);
        }
    }
}
