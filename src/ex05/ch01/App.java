package ex05.ch01;

public class App {
    // 오버로딩 ? -> 오버 : 넘치는 , 로딩 : 적재 -> 넘치게 적재하는
    // 매개 변수의 위치가 다르거나, 갯수가 다를때, 매개변수의 타입이 다를때 -> 오버로딩 가능!
    // 오버로딩은 경우의 수가 많아지면 못쓴다. -> 이럴때 필요한게 상속!
    // 한계가 있을때

    // 질럿 공격 유형 패턴 3가지
    static void attack(Zealot u1, Dragoon u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + " 의 남은 hp :" + u2.hp);
    }

    static void attack(Zealot u1, Zealot u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + " 의 남은 hp :" + u2.hp);
    }

    static void attack(Zealot u1, Darktempler u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + " 의 남은 hp :" + u2.hp);
    }

    // 드라군 공격 유형 패턴 3가지
    static void attack(Dragoon u1, Zealot u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + " 의 남은 hp :" + u2.hp);
    }

    static void attack(Dragoon u1, Dragoon u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + " 의 남은 hp :" + u2.hp);
    }

    static void attack(Dragoon u1, Darktempler u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + " 의 남은 hp :" + u2.hp);
    }

    // 닥템 공격 유형 패턴 3가지
    static void attack(Darktempler u1, Zealot u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + " 의 남은 hp :" + u2.hp);
    }

    static void attack(Darktempler u1, Dragoon u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + " 의 남은 hp :" + u2.hp);
    }

    static void attack(Darktempler u1, Darktempler u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + " 의 남은 hp :" + u2.hp);
    }

    public static void main(String[] args) { // app 이라는 파일은 메인이 있는 파일
        Zealot z1 = new Zealot("질럿1", 100, 10);
        Zealot z2 = new Zealot("질럿2", 100, 10);
        Dragoon d1 = new Dragoon("드라군1", 100, 5);
        Dragoon d2 = new Dragoon("드라군2", 100, 5);
        Darktempler dark1 = new Darktempler("다크1", 100, 50);
        Darktempler dark2 = new Darktempler("다크2", 100, 50);

        System.out.println("----------------------");

        // 질럿 공격 3가지
        // 질럿 - > 드라군 공격
        attack(z1, d1);
        attack(z1, d2);

        // 질럿 - > 질럿 공격
        attack(z1, z2);
        attack(z1, z2);

        // 질럿 - > 다크 공격
        attack(z2, dark1);
        attack(z2, dark2);

        System.out.println("----------------------");

        // 드라군 공격 3가지
        // 드라군 - > 질럿 공격
        attack(d1, z1);
        attack(d1, z2);

        // 드라군 - > 드라군 공격
        attack(d1, d2);
        attack(d1, d2);

        // 드라군 - > 다크 공격
        attack(d1, dark1);
        attack(d1, dark2);

        System.out.println("----------------------");

        // 다크 공격 3가지
        // 다크 - > 질럿 공격
        attack(dark1, z1);
        attack(dark1, z2);

        // 다크 -> 드라군 공격
        attack(dark1, d1);
        attack(dark1, d2);

        // 다크 -> 다크 공격
        attack(dark1, dark2);
        attack(dark1, dark2);

        System.out.println("----------------------");

        // 오버로딩 체험하기
        System.out.println(); // 내려쓰기!
        System.out.println(1);
        System.out.println(1.1);
        System.out.println('가');
        System.out.println("문자열");
        System.out.println(true);

    }
}
