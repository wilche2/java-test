package com.wilche.multithreadingskills.t21priority_规则性;

/**
 * 线程具有规则性，优先级数字越高，即CPU尽量将执行资源让给优先级比较高的线程
 *
 * @author caoweiquan
 * @date 2021/3/23
 */
public class Run {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MyThread1 thread1 = new MyThread1();
            thread1.setPriority(1);
            thread1.start();

            MyThread2 thread2 = new MyThread2();
            thread2.setPriority(10);
            thread2.start();
        }
    }
}
