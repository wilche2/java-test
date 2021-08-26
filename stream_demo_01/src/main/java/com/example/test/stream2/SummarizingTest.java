package com.example.test.stream2;

import com.example.test.view.Student;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author caowq
 * @date 2021-08-26 11:41
 */
public class SummarizingTest {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("广东", 23),
                new Student("广东", 24),
                new Student("广东", 23),
                new Student("北京", 22),
                new Student("北京", 20),
                new Student("北京", 20),
                new Student("海南", 25));

        IntSummaryStatistics summaryStatistics = students.stream().collect(Collectors.summarizingInt(Student::getAge));
        System.out.println("平均值：" + summaryStatistics.getAverage());//平均值：22.428571428571427
        System.out.println("人数：" + summaryStatistics.getCount());//人数：7
        System.out.println("最大值：" + summaryStatistics.getMax());//最大值：25
        System.out.println("最小值：" + summaryStatistics.getMin());//最小值：20
        System.out.println("总和：" + summaryStatistics.getSum());//总和：157
    }

}
