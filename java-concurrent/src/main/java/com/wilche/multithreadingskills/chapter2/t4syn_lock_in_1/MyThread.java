package com.wilche.multithreadingskills.chapter2.t4syn_lock_in_1;

/**
 * @author caoweiquan
 * @date 2021/3/24
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        Service service = new Service();
        service.service1();
    }
}
