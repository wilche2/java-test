package com.wilche.multithreadingskills.chapter1.t19_suspend_resume_lockstop;

/**
 * @author caoweiquan
 * @date 2021/3/22
 */
public class MyThread extends Thread {

    private long i = 0;

    public long getI() {
        return i;
    }

    public void setI(long i) {
        this.i = i;
    }

    @Override
    public void run() {
        while (true) {
            i++;
            System.out.println("i = " + i);
        }
    }
}
