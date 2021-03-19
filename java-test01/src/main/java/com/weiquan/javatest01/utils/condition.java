package com.weiquan.javatest01.utils;

/**
 * @author caoweiquan
 * @date 2021/3/19
 */
public class condition {

    public static void main(String[] args) {
        boolean flag = true; // 设置成 true，保证条件表达式的表达式二一定可以执行
        boolean simpleBoolean = false; // 定义一个基本数据类型的 boolean 变量
        Boolean nullBoolean = null;// 定义一个包装类对象类型的 Boolean 变量，值为 null
        boolean x = flag ? nullBoolean : simpleBoolean; // 使用三目运算符并给 x 变量赋值
        System.out.println("x = " + x);
    }

}
