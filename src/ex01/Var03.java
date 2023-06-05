package ex01;

public class Var03 {
    public static void main(String[] args) {
        // 업캐스팅 - 묵시적 형변환
        int n1 = 10; // 변수의 초기화
        double d1 = n1; // 변수의 선언
        System.out.println(d1);

        // 다운캐스팅 - 명시적 형변환
        double d2 = 10.5;
        // int n2 = d2; (에러발생)
        int n2 = (int)d2;
        System.out.println(n2);

        // 문자 형변환 (아스키코드)
        // int ch = 65;
        // char ch = 65;
            // char data = ch; // 이거왜안될까? 메모리 공간을 생각해봐
        byte ch = 65;
        char data = (char)ch;
        System.out.println(data);
    }
}
