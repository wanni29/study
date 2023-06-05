package practice;

class A {
    private int a; // 전용
    int b; // 디폴트
    public int c; // 공용
}



public class Test {
    public static void main(String[] args) {
        A work = new A();
        // work.a = 10; // 프라이빗이니깐 같은 클래스 안에서만 사용 가능
        work.b = 20; // 디폴트니깐 같은 패키지 안에서만 사용가능
        work.c = 30; // 공용 !

        int num1 = 1;
        int num2 = 3;
        int[] numbers = { 1, 2, 3, 4, 5 };


        for (int i = numbers[num1]; i <= numbers[num2]; i++) {
            int[] answer = { numbers[i] };
            }
            
        }

    }

