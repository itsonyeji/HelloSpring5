package hello.spring.bean;

public class Spring5Bean04Factory {
    //인사말을 출력하는 객체를 생성하는 create 메서드

    //인터페이스를 반환한다
    public static Spring5Bean03 create(String bean){
        Spring5Bean03 obj=null;
        if(bean.equals("kor"))
            obj=new Spring5Bean03Kor();
        else if (bean.equals("eng"))
            obj=new Spring5Bean03Eng();
        else if (bean.equals("jpn")) {
            obj=new Spring5Bean03Jpn();
        }
        return obj;

    }
}
