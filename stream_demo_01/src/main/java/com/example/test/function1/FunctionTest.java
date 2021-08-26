package com.example.test.function1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author caowq
 * @date 2021-08-24 15:34
 */
public class FunctionTest {

    public static void main(String[] args) {
//        Function<Integer, String> f1 = String::valueOf;
//        System.out.println("f1.apply(1) = " + f1.apply(1));
//        identity();
        // andThen();
        biFunction();
    }

    private static void compose() {
        Function<Double, Double> f1 = x -> Math.pow(x, 2);
        Function<Double, Double> f2 = Math::sqrt;

        Function<Double, Double> compose = f2.compose(f1);
        System.out.println("compose.apply(8D) = " + compose.apply(8D));
    }

    private static void biFunction() {
        BiFunction<Double, Double, Double> bif1 = (x, y) -> x + 1.0 + y;
        System.out.println("bif1.apply(10.0, 9.0) = " + bif1.apply(10.0, 9.0));
    }

    private static void andThen() {
        Function<Double, Double> f1 = x -> Math.pow(x, 2);
        Function<Double, Double> f2 = Math::sqrt;

        Function<Double, Double> compose = f1.andThen(f2);
        System.out.println("compose.apply(8D) = " + compose.apply(8D));
    }

    private static void mapToInt() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        int[] arrayOK = list.stream().mapToInt(i -> i).toArray();
//        int[] arrayProblem = list.stream().mapToInt(Function.identity()).toArray();
    }

    private static void identity() {
        Stream<String> stream = Stream.of("I", "love", "you", "too");
        Map<String, Integer> map = stream.collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println(map);
    }

}
