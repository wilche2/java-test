package com.wilche.multithreadingskills.t19_suspend_resume_deal_lock;

/**
 * suspend 使用不当，极易造成公共的同步的对象的独占，使用其它线程无法访问公共对象
 *
 * @author caoweiquan
 * @date 2021/3/22
 */
public class Run {

    public static void main(String[] args) {
        final SynchronizedObject object = new SynchronizedObject();

        try {
            Thread thread1 = new Thread() {
                @Override
                public void run() {
                    object.printString();
                }
            };
            thread1.setName("a");
            thread1.start();
            Thread.sleep(1000);

            Thread thread2 = new Thread() {
                @Override
                public void run() {
                    System.out.println("thread2 启动了，但是进入不了printString()方法！只打印了begin");
                    System.out.println("因为printString方法被 a 线程锁定了并且永远suspend了");
                    object.printString();
                }
            };
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
