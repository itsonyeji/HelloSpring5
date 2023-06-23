package hello.spring.annotation;

import hello.spring.bean.Spring5Bean03;
import org.springframework.stereotype.Component;


//annotation 기반은 xml파일 안만들고 이렇게 만들수있다.
//component를 안만들면 클래스 이름 앞글자를 소문자로 만든 단어를 id로 취급해서 쓴다.
@Component("kor")
public class Spring5Bean07Kor implements Spring5Bean03 {

    public void sayHello(String msg){
        System.out.println("안녕하세요, "+msg);
    }


}
