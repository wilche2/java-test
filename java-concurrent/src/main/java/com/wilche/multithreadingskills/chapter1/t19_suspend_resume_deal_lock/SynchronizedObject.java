package com.wilche.multithreadingskills.chapter1.t19_suspend_resume_deal_lock;

/**
 * @author caoweiquan
 * @date 2021/3/22
 */
public class SynchronizedObject {

    synchronized public void printString() {
        System.out.println("begin");

        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("a 线程永远suspend了");
            Thread.currentThread().suspend();
        }

        System.out.println("end");
    }

}
