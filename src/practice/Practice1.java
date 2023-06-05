package practice;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Practice1 {
    final int SCISSOR = 0;
    final int ROCK = 1;
    final int PAPER = 2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("가위(0), 바위(1), 보(2) : ");
        int user = sc.nextInt();

        int computer = (int) (Math.random() * 3); // random = > 소수점 자리로 랜덤한 수를 만듬 0.99 * 3 은 2임
        if (user == computer)
            System.out.println("인간과 컴퓨터가 비겼음");
        else if (user == (computer + 1) % 3)
            System.out.println("인간 : " + user + "컴퓨터 : " + computer + "인간승리");
        else
            System.out.println("인간 : " + user + "컴퓨터 : " + computer + "컴퓨터승리");
    }
}
