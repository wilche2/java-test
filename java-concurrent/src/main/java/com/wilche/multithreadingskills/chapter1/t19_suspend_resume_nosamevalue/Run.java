package com.wilche.multithreadingskills.chapter1.t19_suspend_resume_nosamevalue;

/**
 * @author caoweiquan
 * @date 2021/3/22
 */
public class Run {

    public static void main(String[] args) {
        try {
            final MyObject object = new MyObject();
            Thread thread1 = new Thread() {
                @Override
                public void run() {
                    object.setValue("a", "aa");
                }
            };
            thread1.setName("a");
            thread1.start();
            Thread.sleep(500);

            Thread thread2 = new Thread() {
                @Override
                public void run() {
                    object.printUsernameAndPassword();
                }
            };
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
