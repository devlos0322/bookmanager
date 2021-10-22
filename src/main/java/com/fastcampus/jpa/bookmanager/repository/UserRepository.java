package com.fastcampus.jpa.bookmanager.repository;

import com.fastcampus.jpa.bookmanager.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//제너릭은 엔티티
//JPA 인터페이스를 만드는것많으로 많은 기능을 쓸 수 있음
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByName(String name);

    User findByEmail(String email);

    User getByEmail(String email);

    User readByEmail(String email);

    User queryByEmail(String email);

    User searchByEmail(String email);

    User streamByEmail(String email);

    User findUserByEmail(String email);

    User findSomethingByEmail(String email);

    //User findByByEmail(String email);

    List<User> findFirst2ByName(String name);
    List<User> findTop2ByName(String name);

    //이녀석은 키워드가 없기 때문에 findByName으로 검색된다.
    List<User> findLast1ByName(String name);
}
