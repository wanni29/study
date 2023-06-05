package ex05.exten;

public class App {
    public static void main(String[] args) {
        // 이딴식으로 코드짜면 절대 안된다!
        Engine so = new Sonata();
        System.out.println(so.name);
        System.out.println(so.power);
    }
}
