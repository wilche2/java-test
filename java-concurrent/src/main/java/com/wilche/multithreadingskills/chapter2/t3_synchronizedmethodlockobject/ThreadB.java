package com.wilche.multithreadingskills.chapter2.t3_synchronizedmethodlockobject;

/**
 * @author caoweiquan
 * @date 2021/3/24
 */
public class ThreadB extends Thread {

    private MyObject myObject;

    public ThreadB(MyObject myObject) {
        super();
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        myObject.methodA();
    }
}
