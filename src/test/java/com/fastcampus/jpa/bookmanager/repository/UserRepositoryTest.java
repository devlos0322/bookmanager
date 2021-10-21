package com.fastcampus.jpa.bookmanager.repository;

import com.fastcampus.jpa.bookmanager.domain.User;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.OptionalInt;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.endsWith;

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

    /* 3번
        User user1 = new User("Jack", "jack@fast.com");
        User user2 = new User("Mason", "Mason@fast.com");
        userRepository.saveAll(Lists.newArrayList(user1,user2));
        List<User> users = userRepository.findAll();
        users.forEach(System.out::println);
    */
        // 즉시 로딩과 지연 로딩 차이 확인하기
    /* 4번
        User user = userRepository.findById(1L).orElse(null);
        System.out.println(user);
    */
    /* 5번
//        userRepository.save(new User("new devlos", "devlos_new@gmail.com"));
//        userRepository.flush(); //데이터베이스와 JPA의 데이터를 동기화 시킴
        userRepository.saveAndFlush(new User("new devlos", "devlos_new@gmail.com"));
        userRepository.findAll().forEach(System.out::println);
    */
    /*  6번 count로 exists 처리
        boolean exists = userRepository.existsById(1L);
        System.out.println(exists);
    */
//        userRepository.delete(userRepository.findById(1L).orElseThrow(RuntimeException::new));
        //userRepository.deleteAll(userRepository.findAllById((Lists.newArrayList(1L,3L))));
        // 쿼리상의 오베헤드 발생 . select -> delete가 수행되므로. 또한 Delete쿼리가 삭제하는만큼 생김
// 7번
/*
        // 쿼리 한번으로 전체 실행
        userRepository.deleteAllInBatch();
        userRepository.findAll().forEach(System.out::println);
*/
/* 8번
        Page<User> users = userRepository.findAll(PageRequest.of(0, 3));
        System.out.println("page : " + users);
        System.out.println("totalElements : " + users.getTotalElements());
        System.out.println("totalPages : " + users.getTotalPages());
        System.out.println("numberOfElements : " + users.getNumberOfElements());
        System.out.println("sort :" + users.getSort());
        System.out.println("sort :" + users.getSort());

        users.getContent().forEach(System.out::println);

 */
        //contains() => 양방향 매처
        //QEE -> Query by example
        /*
        ExampleMatcher matcher = ExampleMatcher.matching()
                .withIgnorePaths("name")    //무시
                .withMatcher("email", endsWith());
        Example<User> example = Example.of(new User("ma", "devlos@gmail.com"),matcher);
        userRepository.findAll(example).forEach(System.out::println);
        */
        //Update
        userRepository.save(new User("devlos", "devlos0322@gmail.com"));
        User user = userRepository.findById(1L).orElseThrow(RuntimeException::new);
        user.setEmail("devlos0323@gmail.com");
        userRepository.save(user);
        // SimpleJpaRepository
        // 이 클래스는 JpaRepository의 구현체이다.
    }



}