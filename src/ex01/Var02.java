package ex01;

public class Var02 {
    public static void main(String[] args) {
        byte b1 = 65; // 1Byte
        int n1 = 2100000000; // 4Byte
        long l1 = 210000000000L; // 8Byte
        double d1 = 2100000000.1111; // 8Byte
        char c1 = '가'; // 2Byte -> 영문자는 1Byte로 표기가 모두 가능하지만 다른나라 언어권에서는 2Byte 가능하기때문에
        boolean check = true; // 1bit

        System.out.println(b1);
        System.out.println(n1);
        System.out.println(l1);
        System.out.println(d1);
        System.out.println(c1);
        System.out.println(check);

        // println 이것도 하나의 메소드임 -> println안에 다양한 값들(피라미터)을 넣어서 실행하는 개념이 오버로딩임
        // 오버라이딩 -> 부모 클래스에서 상속받은 메소드를 자식 클래스에서 재정의 하는것
        // 메소드 이름, 매개변수, 리턴값이 같아야함 
    }

}
