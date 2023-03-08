package HelloWorld;

public class Main {
    public static void main(String[] args) {
        Hello En = new HelloWorldEn();
        Hello Kr = new HelloWorldKr();

        callMethod(En);
        callMethod(Kr);
    }

    //다형성: 부모의 참조변수로 자식 객체를 생성한다
    public static void callMethod(Hello he){ //같은 Hello 객체로 HelloWorldEn, HelloWorldKr 두개를 받을 수 있다
        he.sayHi();
    }
}
