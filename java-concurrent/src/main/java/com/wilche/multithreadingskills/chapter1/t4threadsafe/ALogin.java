package com.wilche.multithreadingskills.chapter1.t4threadsafe;

/**
 * @author caoweiquan
 * @date 2021/3/19
 */
public class ALogin extends Thread {
    @Override
    public void run() {
        LoginServlet.doPost("a", "aa");
    }
}
