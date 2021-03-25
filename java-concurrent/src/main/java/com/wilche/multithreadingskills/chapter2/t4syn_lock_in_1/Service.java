package com.wilche.multithreadingskills.chapter2.t4syn_lock_in_1;

/**
 * @author caoweiquan
 * @date 2021/3/24
 */
public class Service {

    synchronized public void service1() {
        System.out.println("service1");
        service2();
    }

    synchronized public void service2() {
        System.out.println("service2");
        service3();
    }

    synchronized public void service3() {
        System.out.println("service3");
    }

}
