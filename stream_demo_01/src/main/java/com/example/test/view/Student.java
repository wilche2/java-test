package com.example.test.view;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author caowq
 * @date 2021-08-26 11:54
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String province;
    private int age;
    private BigDecimal money;

    public Student(String province, int age) {
        this.province = province;
        this.age = age;
    }

    public Student(int age) {
        this.age = age;
    }


}
