package com.wilche.multithreadingskills.t20yield;

/**
 * 注释掉yield = 用时：2毫秒！
 * 使用yield = 用时：103毫秒！（将cpu让给其它资源导致数据变慢）
 *
 * @author caoweiquan
 * @date 2021/3/23
 */
public class Run {

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }

}
