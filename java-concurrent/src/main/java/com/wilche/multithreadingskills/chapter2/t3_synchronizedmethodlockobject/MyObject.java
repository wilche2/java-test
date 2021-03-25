package com.wilche.multithreadingskills.chapter2.t3_synchronizedmethodlockobject;

/**
 * @author caoweiquan
 * @date 2021/3/24
 */
public class MyObject {

    synchronized public void methodA() {
        try {
            System.out.println("begin methodA threadName = " + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
