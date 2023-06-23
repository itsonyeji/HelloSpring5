package hello.spring.annotation;

public interface Spring5Bean07 {
    //인사말을 출력하는 메서드 정의
    //여러사람과 같이 유지보수를 하기 위해 계층적으로 만듦
    //인터페이스 먼저 만들고 정의하고,
    void sayHello(String msg);
}
