package hello.spring.basic;

import hello.spring.bean.*;

public class Spring5App03 {
    //네번째 사례
    //인사말을 한국어, 영어, 일본어로 출력하도록 기능 추가

    //유연
    //업캐스팅(형변환)
    //변수 하나로 여러객체를 받아쓸수있다.
    //메서드명도 통일가능


    public static void main(String[] args) {
        //인터페이스는 불완전 클래스이기 때문에
        //객체화 불가
        Spring5Bean03 app03=null;
        app03= new Spring5Bean03Kor();
        app03.sayHello("스프링5");

        app03= new Spring5Bean03Eng();
        app03.sayHello("spring5");

        app03= new Spring5Bean03Jpn();
        app03.sayHello("スプリング5");

//        app02.sayHelloKor("스프링5");
//        app02.sayHelloEng("spring5");
//        app02.sayHelloJpn("スプリング5");
    }
}
