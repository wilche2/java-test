package com.wilche.multithreadingskills.chapter1.t21priority_继承性;

/**
 * 线程具有继承性，比如A线程启动B线程，B线程将具有A线程的优先级
 *
 * @author caoweiquan
 * @date 2021/3/23
 */
public class Run {
    public static void main(String[] args) {
        System.out.println("main thread begin priority = " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(6);
        System.out.println("main thread end priority = " + Thread.currentThread().getPriority());

        MyThread1 thread1 = new MyThread1();
        thread1.start();
    }
}
