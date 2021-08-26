package com.example.test.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author caowq
 * @date 2021-08-26 11:29
 */
public class JoiningTest {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("springboot教程","springcloud教程","java教程","架构教程");
        String result1 = list.stream().collect(Collectors.joining(",", "[", "]"));
        String join = String.join(",", list);
        // 打印 springboot教程,springcloud教程,java教程架构教程
        System.out.println(result1);
        System.out.println(join);
    }

}
