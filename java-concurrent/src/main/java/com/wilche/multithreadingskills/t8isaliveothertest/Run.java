package com.wilche.multithreadingskills.t8isaliveothertest;

/**
 * @author caoweiquan
 * @date 2021/3/19
 */
public class Run {

    public static void main(String[] args) {
        CountOperate c = new CountOperate();
        Thread thread = new Thread(c);
        System.out.println("main begin t1 isAlive = " + thread.isAlive());

        thread.setName("A");
        thread.start();
        System.out.println("main end t1 isAlive = " + thread.isAlive());
    }

}
