package com.wilche.multithreadingskills.t5samenum;

/**
 * 留意 i-- 和 System.out.println() 的异常
 *
 * @author caoweiquan
 * @date 2021/3/19
 */
public class MyThread extends Thread {
    private int i = 5;

    @Override
    public void run() {
        System.out.println("i = " + (i--) + " threadName = " + Thread.currentThread().getName());
    }
}
