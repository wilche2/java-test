package com.wilche.multithreadingskills.chapter2.t5_throw_exception_nolock;

/**
 * @author caoweiquan
 * @date 2021/3/24
 */
public class ThreadB extends Thread {

    private Service service;

    public ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
