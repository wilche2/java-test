package com.wilche.multithreadingskills.t22daemon_thread;

/**
 * @author caoweiquan
 * @date 2021/3/23
 */
public class Run {

    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.setDaemon(true);
            thread.start();
            Thread.sleep(5000);
            System.out.println("我要离开thread对象就不在打印了，也就是停止了");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
