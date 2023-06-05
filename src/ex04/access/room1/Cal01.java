package ex04.access.room1;

public class Cal01 {

    void add() { // 같은 패키지 안에서만
        System.out.println("디폴트 더하기");
    }

    public void minus() { // 어디서든지 접근가능
        System.out.println("디폴트 빼기");
    }

    private void multi() { // 같은 클래스 안에서만
        System.out.println("프라이빗 곱하기");
    }

    public static void main(String[] args) {
        Cal01 c1 = new Cal01();
        // 전부 다 가능!
        c1.add();
        c1.minus();
        c1.multi();

    }
}
