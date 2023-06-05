package ex02;

class Hello{
    static int price = 1000;
    String name = "커피";

    void run() {
        int n = 100; // 절대 못쓰는 값이다. 왜냐하면 stack 메모리에 저장되고 메소드 실행 후 자연 소멸 되기 때문이다.
        System.out.println("달린다");
    }
}

public class Mem01 {

    static int price = 10000;
    public static void main(String[] args) {
        System.out.println(Mem01.price);
        System.out.println(Hello.price);
        Hello c = new Hello();
        System.out.println(c.name);
        
        c.run();

    }
}