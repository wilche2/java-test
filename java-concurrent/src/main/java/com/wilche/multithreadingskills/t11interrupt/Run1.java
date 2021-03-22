package com.wilche.multithreadingskills.t11interrupt;

/**
 * interrupted 返回并清除中断状态值
 * @author caoweiquan
 * @date 2021/3/22
 */
public class Run1 {

    public static void main(String[] args) {
        Thread.currentThread().interrupt();
        System.out.println("是否停止1" + Thread.interrupted());
        System.out.println("是否停止2" + Thread.interrupted());
        System.out.println("end");
    }


}
