package com.fastcampus.jpa.bookmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookmanagerApplication {
    /*
        웹 콘솔
        http://localhost:8070/h2-console/
        DB 접속: H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:c87520dd-3b9c-438a-a8f6-dbac68fc52fc'
     */
    public static void main(String[] args) {
        SpringApplication.run(BookmanagerApplication.class, args);
    }

}