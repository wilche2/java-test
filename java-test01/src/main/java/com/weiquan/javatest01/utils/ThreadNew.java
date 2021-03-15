package com.weiquan.javatest01.utils;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author caoweiquan
 * @date 2021/3/14
 */
public class ThreadNew {

    public static void main(String[] args) {

        new MyThread01().start();
        new Thread(new MyThread02()).start();

        FutureTask<Integer> futureTask = new FutureTask<Integer>(new MyThread03());
        new Thread(futureTask).start();
        try {
            Integer value = futureTask.get();
            System.out.println(value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

}

class MyThread01 extends Thread {

    @Override
    public void run() {
        System.out.println("当前线程的名称：" + Thread.currentThread().getName() + "---------my thread 1");
    }

}

class MyThread02 implements Runnable {
    @Override
    public void run() {
        System.out.println("--------- my thread 02");
    }
}

class MyThread03 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("---------my thread 03");
        return 200;
    }
}
