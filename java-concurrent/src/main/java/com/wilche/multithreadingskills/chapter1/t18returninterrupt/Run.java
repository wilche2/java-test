package com.wilche.multithreadingskills.chapter1.t18returninterrupt;

/**
 * 将方法interrupt和return结合使用也可完成停止线程的工作
 *
 * @author caoweiquan
 * @date 2021/3/22
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();
    }

}
