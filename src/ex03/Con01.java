package ex03;

import java.util.Scanner;

public class Con01 {
    public static void main(String[] args) {
        // if(true){}

        int point = 89;
        if (point > 90) {
            System.out.println("A학점");
        } else {
            System.out.println("미달입니다");
        }

        System.out.println("-----------------------------------");

        int grade;
        Scanner sc = new Scanner(System.in);
        System.out.print("성적을 입력하세요 :");
        grade = sc.nextInt();
        if (grade >= 90)
            System.out.print("학점 A");
        else if (grade >= 80)
            System.out.print("학점 B");
        else if (grade >= 70)
            System.out.print("학점 C");
        else if (grade >= 60)
            System.out.print("학점 D");
        else
            System.out.print("학점 F");

    }
}
