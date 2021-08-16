package com.fastcampus.jpa.bookmanager.repository;

import com.fastcampus.jpa.bookmanager.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

//제너릭은 엔티티
//JPA 인터페이스를 만드는것많으로 많은 기능을 쓸 수 있음
public interface UserRepository extends JpaRepository<User, Long> {

}
