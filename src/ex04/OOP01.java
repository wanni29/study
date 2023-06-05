package ex04;

class Player {
    String name;
    int thirty; // 0 ~ 100(클수록 목말라짐) -> 범주 : 도메인이 정해졌다 : 범주가 있다

    public Player(String name, int thirty) {
        this.name = name;
        this.thirty = thirty;
    }

    public void drink() {
        thirty = thirty - 30;
    }

}

public class OOP01 {
    public static void main(String[] args) {
        // Player p = new Player(); // -> 디폴트 생성자는 내가 임의 값을 넣으면 자동생성을 해주지 않는다.
        // -> 디폴트 생성자는 내가 값을 않넣으면 자동생성 함
        /*
         * Player p1 = new Player("홍길동", 100); // 변수를 선언했는데 값이 없는것을 null 이라고 한다.
         * Player p2 = new Player("임꺽정", 100); // 변수를 선언했는데 값이 없는것을 null 이라고 한다.
         * 
         * System.out.println(p1.name);
         * System.out.println(p2.name);
         * 
         * p2.drink();
         * 
         * System.out.println(p1.thirty);
         * System.out.println(p2.thirty);
         */
        int count = 0;
        int answer = 0;
        int n = 3;
        int[] array = { 1, 1, 2, 3, 4, 5 };
        for (int num : array) {
            if (num == n)
                answer++;
            System.out.println(answer);
        }

        System.out.println("----------------------------");

        for (int num1 : array) {
            answer += (num1 == n ? 1 : 0);
            System.out.println(answer);
        }
    }
}
