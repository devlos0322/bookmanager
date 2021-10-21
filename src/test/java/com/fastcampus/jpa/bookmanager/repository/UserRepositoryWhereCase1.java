package com.fastcampus.jpa.bookmanager.repository;

import com.fastcampus.jpa.bookmanager.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserRepositoryWhereCase1 {

    @Autowired
    private UserRepository userRepository;

    @Test
    void crud() {
        userRepository.save(new User("devlos", "devlos0322@gmail.com"));

        User user = userRepository.findById(1L).orElseThrow(RuntimeException::new);
        user.setEmail("devlos0323@gmail.com");

        userRepository.save(user);
    }
    @Test
    void select() {
        System.out.println(userRepository.findByName("devlos0"));

        System.out.println("findByEmail : " + userRepository.findByEmail("devlos0322@gmail.com"));
        System.out.println("getByEmail : " + userRepository.getByEmail("devlos0322@gmail.com"));
        System.out.println("readByEmail : " + userRepository.readByEmail("devlos0322@gmail.com"));
        System.out.println("queryByEmail : " + userRepository.queryByEmail("devlos0322@gmail.com"));
        System.out.println("searchByEmail : " + userRepository.searchByEmail("devlos0322@gmail.com"));
        System.out.println("streamByEmail : " + userRepository.streamByEmail("devlos0322@gmail.com"));
        System.out.println("findUserByEmail : " + userRepository.findUserByEmail("devlos0322@gmail.com"));
        // 오타가 발생하더라도 검색 되게끔 되기 때문에 주의해야함
        System.out.println("findSomethingByEmail : " + userRepository.findSomethingByEmail("devlos0322@gmail.com"));
        // 테스트시 런타임 오류가 나기때문에 에러를 잡을 수 있다.
        //System.out.println("findByByEmail : " + userRepository.findByByEmail("devlos0322@gmail.com"));

        System.out.println("findTop1ByName : " + userRepository.findTop2ByName("devlos4"));
        System.out.println("findFirstByName : " + userRepository.findFirst2ByName("devlos4"));
    }
}
