package com.wilche.multithreadingskills.t4threadsafe;

/**
 * @author caoweiquan
 * @date 2021/3/19
 */
public class Run {

    /**
     * 可能产生的输出效果（非线程安全时）
     * username = b,password = bb
     * username = b,password = aa
     * <p>
     * doPost 方法上加 synchronized 关键字即可
     *
     * @param args
     */
    public static void main(String[] args) {
        ALogin a = new ALogin();
        a.start();
        BLogin b = new BLogin();
        b.start();
    }

}
