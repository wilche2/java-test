package com.wilche.multithreadingskills.t21priority_随机性;

import java.util.Random;

/**
 * @author caoweiquan
 * @date 2021/3/23
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 50000; i++) {
                Random random = new Random();
                random.nextInt();
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("***********MyThread2 用时：" + (endTime - beginTime) + "毫秒！");
    }
}
