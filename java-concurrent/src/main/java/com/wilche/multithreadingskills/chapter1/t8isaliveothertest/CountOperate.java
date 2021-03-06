package com.wilche.multithreadingskills.chapter1.t8isaliveothertest;

/**
 * @author caoweiquan
 * @date 2021/3/19
 */
public class CountOperate extends Thread {

    public CountOperate() {
        System.out.println("CountOperate -- begin");
        System.out.println("Thread.currentTread().getName() = " + Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive() = " + Thread.currentThread().isAlive());
        System.out.println("this.getName() = " + this.getName());
        System.out.println("this.isAlive() = " + this.isAlive());
        System.out.println("tCountOperate -- end");
    }

    @Override
    public void run() {
        System.out.println("CountOperate -- begin");
        System.out.println("Thread.currentTread().getName() = " + Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive() = " + Thread.currentThread().isAlive());
        System.out.println("this.getName() = " + this.getName());
        System.out.println("this.isAlive() = " + this.isAlive());
        System.out.println("tCountOperate -- end");
    }
}
