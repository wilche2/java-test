package com.weiquan.javatest01.utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author caoweiquan
 * @date 2021/3/14
 */
public class ThreadPool {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(new MyThread());
        executorService.execute(new MyThread());
        executorService.execute(new MyThread());

        executorService.shutdown();
    }

}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("my------");
    }
}
