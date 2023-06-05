package practice;
// 필요정보 필기

import java.util.Scanner;

// 문자열을 숫자로 !
/*int i = Integer.parseInt("93"); // 93 이라는 문자열을 인트형으로
System.out.println(i);
double j = Double.parseDouble("98.8"); // 98.8 이라는 문자열을 실수형으로
System.out.println(j);*/

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("원하시는 날짜를 입력해주세요 (단, 날짜 입력 형식 : xxxx-xx-xx ) : ");
        String date = sc.nextLine();
        String a = date.substring(0, 4); // 2023
        String b = date.substring(5, 7); // 05
        String c = date.substring(8); // 26

        System.out.println("수정을 원하시는 부분을 선택해주세요. : year, month, day");
        String collect = sc.nextLine();
        System.out.println(collect);
        int change = Integer.parseInt(collect);

        System.out.println("수정할 값을 입력해주세요. : (단, 입력형식 year : xxxx month xx day xx)");
        String result = sc.nextLine();
        int d = Integer.parseInt(result);

        // int 타입으로 변형
        // 변수 선언
        int year, month, day;
        year = Integer.parseInt(a);
        month = Integer.parseInt(b);
        day = Integer.parseInt(c);

        if (change == year) {
            System.out.println("수정한 날짜는 : " + result + "-" + b + "-" + c + "입니다.");
        }

    }
}
