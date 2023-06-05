package ex02;

import java.util.Scanner;

public class Mem02 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        /*
         * JVM의 작동원리 부터 생각을 해보면 하드웨어에 있는 scanner를 끌어왔을것이다. 왜?
         * class 니깐 그래서 끌어온 클래스를 new 선언해서 메모리 부분의 힙부분으로 저장소를 사용하여
         * 데이터를 처리해 나간다.
         */

        // int x, y, sum;

        // System.out.println("첫 번째 숫자를 입력하시오: ");
        // x = sc.nextInt(); // 멈춤

        // System.out.println("두 번째 숫자를 입력하시오: ");
        // y = sc.nextInt(); // 멈춤
        // sum = x + y;
        // System.out.println("입력하신 숫자의 합은 : " + sum);
        // /*
        //  * String name = sc.next(); // 한단어를 입력받고 싶을때
        //  * int age = sc.nextInt(); // 문자열 안에있는 숫자를 입력받고 싶을때
        //  * double weight = sc.nextDobule(); // 문자열 안에있는 실수를 입력받고 싶을때
        //  * String line = sc.nextLine(); // 문자열 한라인 전체를 입력받고 싶을때
        //  * 
        //  */

        String name;
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하시오 : ");
        name = sc.nextLine();

        System.out.print("나이를 입력하시오 : ");
        age = sc.nextInt();

        System.out.println(name + "님 안녕하세요!" + age + "살 이시네요.");
    }

}
