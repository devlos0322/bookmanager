package com.fastcampus.jpa.bookmanager.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void test() {
        User user = new User();
        user.setEmail("devlos@gmail.com");
        user.setName("devlos");
        System.out.println(">>> "+ user);
    }
}