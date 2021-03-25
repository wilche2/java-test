package com.wilche.multithreadingskills.chapter1.t17stopthrowlock;

/**
 * @author caoweiquan
 * @date 2021/3/22
 */
public class MyThread extends Thread {

    private SynchronizedObject object;

    public MyThread(SynchronizedObject object) {
        this.object = object;
    }

    @Override
    public void run() {
        object.printString("b", "bb");
    }
}
