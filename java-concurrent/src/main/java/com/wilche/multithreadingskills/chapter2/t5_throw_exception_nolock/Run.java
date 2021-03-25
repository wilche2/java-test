package com.wilche.multithreadingskills.chapter2.t5_throw_exception_nolock;

/**
 * @author caoweiquan
 * @date 2021/3/24
 */
public class Run {

    public static void main(String[] args) {
        try {
            Service service = new Service();
            ThreadA threadA = new ThreadA(service);
            threadA.setName("a");
            threadA.start();

            Thread.sleep(500);
            ThreadB threadB = new ThreadB(service);
            threadB.setName("b");
            threadB.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
