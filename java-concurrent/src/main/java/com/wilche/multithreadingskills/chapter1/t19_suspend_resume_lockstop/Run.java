package com.wilche.multithreadingskills.chapter1.t19_suspend_resume_lockstop;

/**
 * "main end" 将不会打印
 * 原因：println方法内部停止时，导致当前作为锁的PrintStream对象未释放，
 * 所以迟迟不能打印
 *
 * @author caoweiquan
 * @date 2021/3/22
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.suspend();
            System.out.println("main end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
