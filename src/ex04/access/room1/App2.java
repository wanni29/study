package ex04.access.room1;

public class App2 {
    public static void main(String[] args) {
        Cal01 c2 = new Cal01();
        c2.add();
        c2.minus();
        // c2.multi(); // 임마는 왜안돼? -> private 이니깐 같은 클래스 끼리만 가능!

    }
}
