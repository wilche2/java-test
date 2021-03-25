package com.wilche.multithreadingskills.chapter2.t2;

/**
 * a set over
 * b set over
 * b num = 200
 * a num = 200
 * <p>
 * 方法中的变量不存在线程安全问题
 *
 * @author caoweiquan
 * @date 2021/3/24
 */
public class Run {

    public static void main(String[] args) {
        HasSelfPrivateNum numRef = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(numRef);
        threadA.start();
        ThreadB threadB = new ThreadB(numRef);
        threadB.start();
    }

}
