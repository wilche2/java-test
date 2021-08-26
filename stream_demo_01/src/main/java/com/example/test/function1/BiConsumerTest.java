package com.example.test.function1;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * @author caowq
 * @date 2021-08-25 9:32
 */
public class BiConsumerTest {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "a");
        map.put("b", "b");
        map.put("c", "c");
        map.put("d", "d");
        BiConsumer<String, String> bi = (k, v) -> {
            System.out.println(k);
            System.out.println(v);
        };
        bi.accept("1", "1");
        map.forEach(bi);
    }

}
