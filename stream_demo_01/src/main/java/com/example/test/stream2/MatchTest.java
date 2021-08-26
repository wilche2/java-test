package com.example.test.stream2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author caowq
 * @date 2021-08-26 10:19
 */
public class MatchTest {

    public static void main(String[] args) {
        List<String> strs = Arrays.asList("a", "a", "a", "a", "b");
        // 任意一个匹配上谓词即返回true
        boolean aa = strs.stream().anyMatch(str -> str.equals("a"));
        // 全部匹配上谓词才返回true
        boolean bb = strs.stream().allMatch(str -> str.equals("a"));
        // 全部未匹配谓词才返回true
        boolean cc = strs.stream().noneMatch(str -> str.equals("a"));
        long count = strs.stream().filter(str -> str.equals("a")).count();
        System.out.println(aa);// TRUE
        System.out.println(bb);// FALSE
        System.out.println(cc);// FALSE
        System.out.println(count);// 4

        // 如果list.size == 0，那么allMatch默认返回true
        List<String> strs1 = new ArrayList<>();
        boolean bb1 = strs1.stream().allMatch(str -> str.equals("a"));
    }

}
