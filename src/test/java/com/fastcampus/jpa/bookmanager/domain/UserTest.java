package com.fastcampus.jpa.bookmanager.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void test() {
        User user = new User();
        user.setEmail("devlos@gmail.com");
        user.setName("devlos");
        System.out.println(">>> "+ user);

        User user1 = new User(null, "devlos", "devlos@gmail.com", LocalDateTime.now(), LocalDateTime.now());
    }
}