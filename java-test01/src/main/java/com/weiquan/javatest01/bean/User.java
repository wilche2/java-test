package com.weiquan.javatest01.bean;

import lombok.Builder;
import lombok.Data;

/**
 * @author caowq
 * @date 2021-06-18 16:01
 */
@Data
@Builder
public class User {

    private int id;
    private String name;
    private int age;

}
