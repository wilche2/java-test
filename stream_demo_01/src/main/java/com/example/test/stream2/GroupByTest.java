package com.example.test.stream2;

import com.example.test.view.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author caowq
 * @date 2021-08-26 11:38
 */
public class GroupByTest {

    public static void main(String[] args) {
        groupByAdvance();
    }

    public static void groupByAdvance() {
        List<Student> list = Arrays.asList(new Student("广东", 23),
                new Student("广东", 24),
                new Student("广东", 23),
                new Student("北京", 22),
                new Student("北京", 20),
                new Student("北京", 20),
                new Student("海南", 25));

        Map<String, Long> listMap = list.stream().collect(Collectors.groupingBy(Student::getProvince, Collectors.counting()));
        /* 输出
         * 广东省人数有 3
         * 海南省人数有 1
         * 北京省人数有 3
         */
        listMap.forEach((key, value) -> System.out.println(key+"省人数有 "+value));
    }

    public static void groupBy() {
        List<Student> students = Arrays.asList(new Student("广东", 23),
                new Student("广东", 24),
                new Student("广东", 23),
                new Student("北京", 22),
                new Student("北京", 20),
                new Student("北京", 20),
                new Student("海南", 25));

        Map<String, List<Student>> listMap = students.stream().collect(Collectors.groupingBy(Student::getProvince));
        listMap.forEach((key, value) -> {
            System.out.println("========");
            System.out.println(key);
            value.forEach(obj -> System.out.println(obj.getAge()));
        });
    }
}
