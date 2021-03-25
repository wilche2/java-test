package com.wilche.multithreadingskills.chapter2.t3_synchronizedmethodlockobject;

/**
 *
 * 使用synchronized字段一定是排队运行的
 * 只有共享资源的读写访问才需要同步化
 * @author caoweiquan
 * @date 2021/3/24
 */
public class Run {

    public static void main(String[] args) {
        MyObject myObject = new MyObject();
        ThreadA threadA = new ThreadA(myObject);
        threadA.setName("A");
        ThreadB threadB = new ThreadB(myObject);
        threadB.setName("B");
        threadA.start();
        threadB.start();
    }

}
