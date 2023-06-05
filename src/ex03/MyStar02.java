package ex03;

public class MyStar02 {
    public static void main(String[] args) {
        // 별 5개를 출력하는 for문
        for (int i = 0; i < 5; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < 4; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < 2; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < 1; i++) {
            System.out.print("*");
        }
        System.out.println();

        // 코드 리펙토링!
        int end = 6;
        for (int j = 0; j < 6; j++) { // 0 1 2 3 4
            end = end - 1;
            for (int i = 0; i < end; i++) { // 0 1 2 3 4
                System.out.print("*");
            }
            System.out.println();

        }

        for (int i = 1; i < 6; i++) {
            for (int j = 6; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();

        }

        // 코드 리펙토링!!
    }
}
