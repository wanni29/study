package practice;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("원하시는 수를 입력해주세요 : ");
        a = sc.nextInt();

        if (a % 2 == 1)
            System.out.println(a + "는 홀수입니다.");
        else if (a % 2 == 0)
            System.out.println(a + "는 짝수입니다.");
    }
}
