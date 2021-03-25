package com.wilche.multithreadingskills.chapter2.t4syn_lock_in_1;

/**
 * synchronized 拥有锁重入的功能，也就是在使用synchronized时，
 * 当一个线程得到一个对象锁时，再次请求此对象锁时是可以再次得到该对象的锁的。
 * <p>
 * 可重入锁：自己可以再次获取自己内部的锁
 *
 * @author caoweiquan
 * @date 2021/3/24
 */
public class Run {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }

}
