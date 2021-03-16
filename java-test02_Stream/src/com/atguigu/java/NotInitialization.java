package com.atguigu.java;

/**
 * @author caoweiquan
 * @date 2021/3/16
 */

/**
 * 被动引用 Demo1:
 * 通过子类引用父类的静态字段，不会导致子类初始化。
 *
 * @author ylb
 */
class SuperClass {
    static {
        System.out.println("SuperClass init!");
    }

    public static int value = 123;
}

class SubClass extends SuperClass {
    static {
        System.out.println("SubClass init!");
    }
}

/**
 * 加载，连接=「验证，准备，解析」，初始化，使用，卸载
 */
public class NotInitialization {

    /**
     * 被动引用 Demo1:
     * 通过子类引用父类的静态字段，不会导致子类初始化。
     * @param args
     */
//    public static void main(String[] args) {
//        System.out.println(SubClass.value);
//        // SuperClass init!
//    }

    /**
     * 被动引用 Demo2:
     * 通过数组定义来引用类，不会触发此类的初始化。
     *
     * @param args
     */
//    public static void main(String[] args) {
//        SuperClass[] superClasses = new SuperClass[10];
//    }

    public static void main(String[] args) {
        System.out.println(ConstClass.HELLO_BINGO);
    }


}

/**
 * 被动引用 Demo3:
 * 常量在编译阶段会存入调用类的常量池中，本质上并没有直接引用到定义常量的类，因此不会触发定义常量的类的初始化。
 *
 * @author ylb
 *
 */
class ConstClass {
    static {
        System.out.println("ConstClass init!");
    }

    public static final String HELLO_BINGO = "Hello Bingo";

}
