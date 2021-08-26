package com.example.test.stream2;

import com.example.test.view.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author caowq
 * @date 2021-08-26 15:02
 */
public class ParallelStreamTest {

    public static void main(String[] args) {
//
//        List<Student> list = Arrays.asList(new Student(1), new Student(2), new Student(3), new Student(4), new Student(5));
//        Map<Boolean, List<Student>> recognizedMap = list
//                .parallelStream()
//                .collect(Collectors.partitioningBy(q -> q.getAge() > 3));
//        System.out.println("recognizedMap = " + recognizedMap);

//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < 10000; i++) {
//            list.add(i);
//        }
//        System.out.println(list.size());
//        Map<Boolean, List<Integer>> collect = list.parallelStream().collect(Collectors.partitioningBy(i -> i > 5000));
//        System.out.println("collect.true = " + collect.get(true).size());
//        System.out.println("collect.false = " + collect.get(false).size());

        List<Student> list = getList();
        List<Student> students = new ArrayList<>(list.parallelStream()
                .collect(Collectors.toMap(Student::getProvince, a -> a, (o1, o2) -> {
                    o1.setAge(o1.getAge() + o2.getAge());
                    return o1;
                })).values());

        System.out.println("students = " + Arrays.toString(students.toArray()));
    }

    private static List<Student> getList() {
        List<Student> list = new ArrayList<>(1110);
        for (int i = 0; i < 1000; i++) {
            list.add(new Student(i));
        }
        for (int i = 0; i < 10; i++) {
            list.add(new Student("cwq", i));
        }
        for (int i = 0; i < 100; i++) {
            list.add(new Student("qq", i));
        }
        for (int i = 0; i < 100; i++) {
            list.add(new Student("eweqwewq", i));
        }
        return list;
    }

}
