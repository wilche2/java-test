package com.wilche.multithreadingskills.t11interrupt;

/**
 * isInterrupted 返回中断状态值
 * @author caoweiquan
 * @date 2021/3/22
 */
public class Run2 {

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        thread.interrupt();
        System.out.println("是否停止1" + thread.isInterrupted());
        System.out.println("是否停止2" + thread.isInterrupted());
        System.out.println("end");
    }

}
