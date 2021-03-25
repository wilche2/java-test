package com.wilche.multithreadingskills.chapter2.t2;

/**
 * @author caoweiquan
 * @date 2021/3/24
 */
public class ThreadB extends Thread {

    private HasSelfPrivateNum numRef;

    public ThreadB(HasSelfPrivateNum numRef) {
        super();
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("b");
    }
}
