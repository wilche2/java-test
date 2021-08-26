package com.example.test.stream2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author caowq
 * @date 2021-08-25 14:11
 */
public class ForTest1 {

    public static void main(String[] args) {
        test1();
    }

    public static void test0() {
        List<String> strs = Arrays.asList("a", "b", "c");
        // 串行流
        strs.stream().forEachOrdered(System.out::print);//abc
        System.out.println();
        strs.stream().forEach(System.out::print);//abc
        System.out.println();

        // 并行流
        strs.parallelStream().forEachOrdered(System.out::print);//abc
        System.out.println();
        strs.parallelStream().forEach(System.out::print);//bca
    }

    public static void test1() {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        Stream<Integer> stream = integers.stream();
        // 报错java.lang.IllegalStateException: stream has already been operated upon or closed
        stream.forEach(obj -> System.out.print(obj));
        stream.forEach(obj -> System.out.print(obj));
    }

}
