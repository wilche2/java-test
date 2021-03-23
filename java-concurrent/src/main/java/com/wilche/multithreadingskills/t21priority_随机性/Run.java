package com.wilche.multithreadingskills.t21priority_随机性;

/**
 * 线程具有随机性
 * 不要把线程的优先级和执行顺序完全挂钩，它们的关系具有随机性
 *
 * @author caoweiquan
 * @date 2021/3/23
 */
public class Run {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MyThread1 thread1 = new MyThread1();
            thread1.setPriority(5);
            thread1.start();

            MyThread2 thread2 = new MyThread2();
            thread2.setPriority(6);
            thread2.start();
        }
    }
}
