package com.wilche.multithreadingskills.chapter1.t3share.share;

/**
 * 共享count
 *
 * @author caoweiquan
 * @date 2021/3/19
 */
public class MyThread extends Thread {

    private int count = 5;

    @Override
    public synchronized void run() {
        super.run();
        count--;
        // 此示例不要用for循环，因为使用同步后其它线程就得不到运行的机会了
        // 一直由一个线程进行减法运算
        System.out.println("由" + this.currentThread().getName() + "计算，count = " + count);
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread a = new Thread(myThread, "A");
        Thread b = new Thread(myThread, "B");
        Thread c = new Thread(myThread, "C");
        Thread d = new Thread(myThread, "D");
        Thread e = new Thread(myThread, "E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
