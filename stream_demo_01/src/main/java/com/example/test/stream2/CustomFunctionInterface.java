package com.example.test.stream2;

import com.example.test.api.OperFunction;

/**
 * @author caowq
 * @date 2021-08-26 16:46
 */
public class CustomFunctionInterface {

    public static void main(String[] args) throws Exception {
        System.out.println(operator(20, 5, (x, y) -> x * y));// 乘法
        System.out.println(operator(20, 5, (x, y) -> x + y));// 加法
        System.out.println(operator(20, 5, (x, y) -> x - y));// 减法
        System.out.println(operator(20, 5, (x, y) -> x / y));// 除法
    }
    // 该方法参数为上述接口
    public static Integer operator(Integer x, Integer y, OperFunction<Integer, Integer> of) {
        return of.operator(x, y);
    }

}
