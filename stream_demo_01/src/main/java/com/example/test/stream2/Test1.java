package com.example.test.stream2;

import java.util.Arrays;

/**
 * @author caowq
 * @date 2021-08-25 11:30
 */
public class Test1 {

    public static void main(String[] args) {
        String[] strs = { "aaa", "bbb", "ccc" };
        Arrays.stream(strs).map(str -> str.split("")).forEach(System.out::println);// Ljava.lang.String;@53d8d10a
        Arrays.stream(strs).map(str -> str.split("")).flatMap(Arrays::stream).forEach(System.out::println);// aaabbbccc
        Arrays.stream(strs).map(str -> str.split("")).flatMap(str -> Arrays.stream(str)).forEach(System.out::println);// aaabbbccc
    }

}
