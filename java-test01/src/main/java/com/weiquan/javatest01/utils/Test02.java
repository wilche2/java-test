package com.weiquan.javatest01.utils;

import com.weiquan.javatest01.bean.User;

import java.util.Optional;

/**
 * @author caowq
 * @date 2021-06-18 16:00
 */
public class Test02 {

    public static void main(String[] args) {
        User u = getUser();
        Optional<User> user = Optional.ofNullable(u);
        String name = user.isPresent() ? user.get().getName() : "666";
        System.out.println(name);
    }

    public static User getUser() {
        return User.builder().name("999").build();
    }

}
