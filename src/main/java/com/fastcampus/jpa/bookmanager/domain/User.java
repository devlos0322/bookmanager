package com.fastcampus.jpa.bookmanager.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

//@ToString
//@Getter
//@Setter
//생성자 관련 constructor
/*
    @NoArgsConstructor : 입력값 없이 생성자로 만드는 것 (거의 무조건 들어감)
    @AllArgsConstructor : 생성자 만들때 값 대입해서 만드는 것
    @RequiredArgsConstructor : 꼭 필요한 인자만을 이용해서 생성자를 만들어줌 (required 옵션이 있을 경우에만 동작. 없으면 NoArgs와 같음)
                               class의 field에 @NonNull을 사용하여 생성자 필수 입력요소를 만들 수 있음
*/
@NoArgsConstructor  //아무런 인자 없이 생성할 경우 - 무조건 들어가야함 (필드 중에 nonNull이 있을경우 에러가 나기 때문임)
@RequiredArgsConstructor    //필수사항들을 받아서 생성자 생성함 @NonNull을 붙인 것들
@AllArgsConstructor //모든 인자를 받아서 생성자 실행함
@EqualsAndHashCode //@Data 어노테이션에서 구현하고 있는 내용이고, Java에서 객체의 동등성을 비교하기 위해 Overriding하기를 권고하고 있음 (내용 확인 필요)
@Data   /* 엔티티 객체를 사용하면서 가장 많이 씀 다음의 어노테이션을 자동으로 생성함.
           (Equivalent to {@code @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode}.)
        */
@Builder //AllArgsConstructor 처럼 객체를 생성할 때 사용함. User.builder().name().email().build() 와 같은 빌더 형식을 만들 때 사용 (테스트코드 작성시 자주 사용됨)
@Entity
public class User {
    //getter setter를 직접 만드는 방식 < generate를 이용하는 방법 < Lombok을 이용하는 방법
    //create At, update At은 JPA의 기본요소
    //그외 객체지향 표준을 준수하기 위해 getter, setter를 만들어야한다.
    //직접만드는법, command n을 이용해 만드는법
    //컴파일 될 때 setter,   getter가 생성됨
    //JPA에서는 컬럼이 몇십개 생성해야할 경우가 대부분이기 때문에 lombok을 이용하는것이 좋다.
    //ToString 해야하는이유
    //Java의 모든 class는 Object 클래스를 상속받는다.
    @Id //Primary Key
    @GeneratedValue //자동 증가
    private Long id;

    @NonNull
    private String name;
    @NonNull
    private String email;
    private LocalDateTime createdAt;    //생성시각
    private LocalDateTime updatedAt;    //업데이트 시각

//    public String toString() {
//        return "User(name=" + this.getName() + ", email=" + this.getEmail() + ", createdAt=" + this.getCreatedAt() + ", updatedAt=" + this.getUpdatedAt() + ")";
//    }

}
