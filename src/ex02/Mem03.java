package ex02;

import java.util.Scanner;

public class Mem03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("초를 입력하시오 : ");
        int second, a, b;
        second = sc.nextInt();
        a = second / 60; // 분
        b = second % 60; // 초
        System.out.println(second + "초 는" + a + "분" + b + "초입니다.");
    }

}
