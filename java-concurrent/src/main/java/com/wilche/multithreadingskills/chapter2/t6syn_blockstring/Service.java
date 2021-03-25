package com.wilche.multithreadingskills.chapter2.t6syn_blockstring;

/**
 * @author caoweiquan
 * @date 2021/3/24
 */
public class Service {

    private String usernameParam;
    private String passwordParam;

    public void setUsernamePassword(String username, String password) {
        try {
            String anyString = new String();
            synchronized (anyString) {
                System.out.println("ThreadName = " + Thread.currentThread().getName() + " " + System.currentTimeMillis() + " 进入同步代码块");
                usernameParam = username;
                Thread.sleep(3000);
                passwordParam = password;
                System.out.println("ThreadName = " + Thread.currentThread().getName() + " " + System.currentTimeMillis() + " 离开同步代码块");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
