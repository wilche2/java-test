package com.example.test.function1;

import java.util.function.Consumer;

/**
 * @author caowq
 * @date 2021-08-24 15:20
 */
public class ConsumerTest {

    public static void main(String[] args) {
        Consumer<String> c = x -> {
            if ("1".equals(x)) {
                System.out.println("x1 = " + x);
                return;
            }
            if ("2".equals(x)) {
                System.out.println("x2 = " + x);
                return;
            }
            System.out.println("xx = " + x);
        };

        // c.accept("2");
        Consumer<String> cc = c.andThen(x -> System.out.println("after = " + x));
        cc.accept("2");
    }

}
