package com.wilche.multithreadingskills.chapter1.t7isalive;

/**
 * isAlive 判断当前线程是否处理活跃状态
 *
 * @author caoweiquan
 * @date 2021/3/19
 */
public class Run {

    public static void main(String[] args) {
        MyThread run = new MyThread();
        System.out.println("begin = " + run.isAlive());
        run.start();
        try {
            // 1秒内已经执行完毕了，begin = false
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("begin = " + run.isAlive());
    }

}
