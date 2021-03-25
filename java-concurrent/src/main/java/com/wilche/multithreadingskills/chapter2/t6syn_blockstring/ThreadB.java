package com.wilche.multithreadingskills.chapter2.t6syn_blockstring;

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
        service.setUsernamePassword("b", "bb");
    }
}
