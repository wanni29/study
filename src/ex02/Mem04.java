package ex02;

public class Mem04 {
    public static void main(String[] args) {
        int x = 1, y = 1;

        int a = x++; // 후증감자
        int b = ++y; // 선증감자
        System.out.println("a=" + a + ", b=" + b);

        int c = 100, d = 200;
        c += 10; // c = 100 + 10
        d /= 10; // d = 200 / 10
        System.out.println("c=" + c + ", d=" + d);
    }
}
