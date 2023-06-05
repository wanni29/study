package ex02;

import java.util.Scanner;

public class Mem07 {
    public static void main(String[] args) {
        //변수선언 
        int a;
        double b, b1, c, c1;
        //필요자료
        // (b - 32) * 5.0/9.0 
        // (c * 9.0/5.0) + 32 


        System.out.println("========================");
        System.out.println("1. 화씨 -> 섭씨");
        System.out.println("2. 섭씨 -> 화씨");
        System.out.println("========================");

        Scanner sc = new Scanner(System.in);
        System.out.println("번호를 선택하시오 : ");
        a = sc.nextInt();
        
        if (a == 1) {
            System.out.print("화씨 온도를 입력해주세요 :");
            b = sc.nextDouble();
            b1 = (b - 32) * 5.0/9.0;
            System.out.println("섭씨 온도 :" + b1);
        } else{
            System.out.println("섭씨 온도를 입력해주세요 :");
            c = sc.nextDouble();
            c1 = (c * 9.0/5.0) + 32;
            System.out.println("화씨 온도 :" + c1);
        }
    }

}
