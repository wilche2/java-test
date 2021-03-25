package com.wilche.multithreadingskills.chapter2.t3_synchronizedmethodlockobject2.t3_synchronizedmethodlockobject;

/**
 * 使用synchronized字段一定是排队运行的
 * 1. 即便A先持有了锁，但是B也异步访问同类中的未加锁的不同方法
 * 2. A先持有了锁，B调用同类同锁的加锁方法，会同步执行
 *
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
