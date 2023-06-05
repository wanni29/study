package ex03;

public class Multiple {
    public static void main(String[] args) {
        System.out.println("구구단");
        System.out.println();
        // 코드 삽질화 시작
        // 2단
        for (int n = 2; n < 10; n++) {
            for (int m = 1; m < 10; m++) {
                System.out.print(n + "*" + m + "=" + n * m + ", ");
            }
            System.out.println();

        }
    }
}