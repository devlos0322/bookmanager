package com.fastcampus.jpa.bookmanager.repository;

import com.fastcampus.jpa.bookmanager.domain.User;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import javax.transaction.Transactional;
import java.util.List;
import java.util.OptionalInt;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
//    @Transactional //getOne을 쓸경우 필요함 Lazy fatch를 지원함
    void crud() {   //create, read, update, delete
    /* 1번
        //        userRepository.save(new User()); //테이블에 저장하는것

        //System.out.println(">>> " + userRepository.findAll());  //User 테이블의 모든 정보를 출력
        userRepository.findAll().forEach(System.out::println);  //Java Lambda
        //람다와 같음
//        for (User user: userRepository.findAll()) {
//            System.out.println(user);
//        }
    */
//        List<User> users = userRepository.findAll(Sort.by(Sort.Direction.DESC, "name"));


        //1번, 3번, 5번만 호출하기
    /* 2번
        List<User> users = userRepository.findAllById(Lists.newArrayList(1L,3L,5L));

        users.forEach(System.out::println);
    */

    /* 2번
        User user1 = new User("Jack", "jack@fast.com");
        User user2 = new User("Mason", "Mason@fast.com");
        userRepository.saveAll(Lists.newArrayList(user1,user2));
        List<User> users = userRepository.findAll();
        users.forEach(System.out::println);
    */
        // 즉시 로딩과 지연 로딩 차이 확인하기
        User user = userRepository.findById(1L).orElse(null);
        System.out.println(user);
    }
}