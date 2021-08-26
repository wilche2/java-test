package com.example.test.stream2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

/**
 * @author caowq
 * @date 2021-08-26 11:05
 */
public class MaxOrMinTest {

    public static void main(String[] args) {
        List<String> strs = Arrays.asList("d", "b", "a", "c", "a");
        Optional<String> min = strs.stream().min(Comparator.comparing(Function.identity()));
        Optional<String> max = strs.stream().max((o1, o2) -> o1.compareTo(o2));
        System.out.println(String.format("min:%s; max:%s", min.get(), max.get()));// min:a; max:d

        Optional<String> aa = strs.stream().filter(str -> !str.equals("a")).findFirst();
        Optional<String> bb = strs.stream().filter(str -> !str.equals("a")).findAny();

        Optional<String> aa1 = strs.parallelStream().filter(str -> !str.equals("a")).findFirst();
        Optional<String> bb1 = strs.parallelStream().filter(str -> !str.equals("a")).findAny();

        System.out.println(aa.get() + "===" + bb.get());// d===d
        System.out.println(aa1.get() + "===" + bb1.get());// d===b or d===c
    }

}
