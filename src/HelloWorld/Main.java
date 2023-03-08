package HelloWorld;

public class Main {
    public static void main(String[] args) {
        Hello En = new HelloWorldEn();
        Hello Kr = new HelloWorldKr();

        callMethod(En);
        callMethod(Kr);
    }

    public static void callMethod(Hello he){
        he.sayHi();
    }
}
