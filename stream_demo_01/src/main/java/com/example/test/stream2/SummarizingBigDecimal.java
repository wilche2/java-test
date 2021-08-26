package com.example.test.stream2;

import com.example.test.utils.CollectorsUtil;
import com.example.test.view.Student;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author caowq
 * @date 2021-08-26 11:53
 */
public class SummarizingBigDecimal {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("广东", 23, BigDecimal.valueOf(23)),
                new Student("广东", 24, BigDecimal.valueOf(24)),
                new Student("广东", 23, BigDecimal.valueOf(23)),
                new Student("北京", 22, BigDecimal.valueOf(22)),
                new Student("北京", 20, BigDecimal.valueOf(20)),
                new Student("北京", 20, BigDecimal.valueOf(20)),
                new Student("海南", 25, BigDecimal.valueOf(25)));

        Map<String, BigDecimal> collect = students.stream().collect(Collectors.groupingBy(Student::getProvince, CollectorsUtil.summingBigDecimal(Student::getMoney)));
        System.out.println(collect);
        //归约造作
        BigDecimal reduce = students.stream().map(Student::getMoney).reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println(reduce);
        int sum = students.stream().mapToInt(Student::getAge).sum();
        System.out.println(sum);
    }

}
