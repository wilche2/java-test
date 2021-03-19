package com.wilche.multithreadingskills.t4threadsafe;

/**
 * @author caoweiquan
 * @date 2021/3/19
 */
public class BLogin extends Thread {
    @Override
    public void run() {
        LoginServlet.doPost("b", "bb");
    }
}
