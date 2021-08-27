package com.example.test.stream2;

import com.example.test.utils.BigDecimalSummaryStatistics;
import com.example.test.utils.CollectorsUtil;
import com.example.test.view.Student;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author caowq
 * @date 2021-08-26 11:53
 */
public class SummarizingBigDecimal {

    public static void main(String[] args) {
        test2();
    }

    public static void test1() {
        List<Student> students = getStudents();

        Map<String, BigDecimal> collect = students.stream().collect(Collectors.groupingBy(Student::getProvince, CollectorsUtil.summingBigDecimal(Student::getMoney)));
        IntSummaryStatistics collect1 = students.stream().collect(Collectors.summarizingInt(Student::getAge));
        System.out.println(collect);
        //归约造作
        BigDecimal reduce = students.stream().map(Student::getMoney).reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println(reduce);
        int sum = students.stream().mapToInt(Student::getAge).sum();
        System.out.println(sum);
    }

    public static void test2() {
        List<Student> students = getStudents();
        BigDecimalSummaryStatistics bigDecimalSummaryStatistics = students.stream().collect(CollectorsUtil.summarizingBigDecimal(Student::getMoney));
        System.out.println("最大值：" + bigDecimalSummaryStatistics.getMax());
        System.out.println("最小值：" + bigDecimalSummaryStatistics.getMin());
        System.out.println("个数：" + bigDecimalSummaryStatistics.getCount());
        System.out.println("总值：" + bigDecimalSummaryStatistics.getSum());
        System.out.println("平均值：" + bigDecimalSummaryStatistics.getAverage(2, RoundingMode.HALF_UP));

    }

    private static List<Student> getStudents() {
        return Arrays.asList(new Student("广东", 23, BigDecimal.valueOf(23)),
                new Student("广东", 24, BigDecimal.valueOf(24)),
                new Student("广东", 23, BigDecimal.valueOf(23)),
                new Student("北京", 22, BigDecimal.valueOf(22)),
                new Student("北京", 20, BigDecimal.valueOf(20)),
                new Student("北京", 20, BigDecimal.valueOf(20)),
                new Student("海南", 25, BigDecimal.valueOf(25)));
    }

}
