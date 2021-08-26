package com.example.test.api;

@FunctionalInterface
public interface OperFunction<R, T> {

    /**
     * 将通过这一个接口来实现加、减、乘、除四个功能
     *
     * @param a 第一个参数
     * @param b 第一个参数
     * @return 结果
     */
    R operator(T a, T b);

}
