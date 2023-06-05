package ex01;

public class Var04 {
    public static void main(String[] args) {
        // 문자열
        String s1 = "가나다";
        System.out.println(s1);
        
        //연결연산자
        String name = "홍길동";
        int age = 25;
        System.out.println(name + "의 나이는" + age); 
        /*변수의 타입이 다를경우 플러스를 할때는 연결연산자로 치환
        위의 경우 name은 String 타입 "의 나이는"는 String타입
        결국 두개가 타입이 같기때문에 더하기연산자

        age는 int타입이라서 연결 연산자*/
    }

}
