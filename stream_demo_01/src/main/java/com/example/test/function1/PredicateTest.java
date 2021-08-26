package com.example.test.function1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author caowq
 * @date 2021-08-24 9:43
 */
public class PredicateTest {

    public static void main(String[] args) {
        // 2.
        Predicate<String> predicate = "七夜雪"::equals;
        // 1. test 方法测试
        System.out.println("1---> " + predicate.test("七夜雪"));
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        // 2. Predicate 返回一个List中的偶数
        // list.stream(), 表示将List作为流进行处理, filter()方法接收一个Predicate, toArray是将流转换成数组
        Object[] result = list.stream().filter(t -> t % 2 == 0).toArray();
        print("2---> " + Arrays.toString(result));

        // 3. 测试Predicate的and方法, 打印list中大于3, 小于6的数字
        Predicate<Integer> predicate1 = t -> t > 3;
        predicate1 = predicate1.and(t -> t < 6);
        result = list.stream().filter(predicate1).toArray();
        print("3---> " + Arrays.toString(result));

        // 4. 测试Predicate的or方法, 打印list中小于3或大于5的数字
        predicate1 = t -> t < 3;
        predicate1 = predicate1.or(t -> t > 5);
        result = list.stream().filter(predicate1).toArray();
        print("4---> " + Arrays.toString(result));

        // 5. 测试Predicate的negate方法, 返回list中大于等于3,小于等于5的数字, 即对场景4取反
        result = list.stream().filter(predicate1.negate()).toArray();
        print("5---> " + Arrays.toString(result));

        // 6. 测试静态方法isEqual方法, 个人感觉这个方法没啥用处
        predicate = Predicate.isEqual("七夜雪");
        print("6---> " + predicate.test("七夜雪"));
        print("6---> " + predicate.test("七夜雪1"));

        // 1.
//        Person person = new Person(22, "lisi");
//        Predicate<Person> predicate = Predicate.isEqual(person);
//        System.out.println(Arrays.toString(Stream.of(
//                new Person(21, "zhangsan"),
//                new Person(22, "lisi"),
//                new Person(23, "wangwu"),
//                new Person(24, "wangwu"),
//                new Person(22, "lisi"),
//                new Person(26, "zhangsan")
//        )
//                .filter(predicate).toArray()));
    }

    // 辅助打印方法
    private static void print(Object obj) {
        System.out.println(obj);
    }

    public static class Person {
        private int age;
        private String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            if (age != person.age || !name.equals(person.name)) return false;
            return true;
        }

        @Override
        public int hashCode() {
            int result = age;
            result = 31 * result + name.hashCode();
            return result;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

}


