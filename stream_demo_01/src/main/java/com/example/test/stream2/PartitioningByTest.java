package com.example.test.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author caowq
 * @date 2021-08-26 11:36
 */
public class PartitioningByTest {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "springboot", "HTML5", "nodejs", "CSS3");
        Map<Boolean, List<String>> result = list.stream().collect(Collectors.partitioningBy(obj -> obj.length() > 4));
        // 长度大于四：[springboot, HTML5, nodejs]
        System.out.println("长度大于四：" + result.get(true));
        // 长度小于等于四：[java, CSS3]
        System.out.println("长度小于等于四：" + result.get(false));
    }

}
