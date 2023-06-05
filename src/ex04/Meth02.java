package ex04;

class Cal02 {
    void add(int n1, int n2) { // int n1, n2 -> 매개변수라고 함 // 지역변수, 로컬변수 -> 휘발성 데이터 (stack)
        System.out.println("더하기 : " + (n1 + n2));
    } // 스택을 종료하고, 복귀주소를 확인하고 복귀한다.

    // minus
    void minus(int n1, int n2) {
        System.out.println("빼기 : " + (n1 - n2));
    }

    // multi
    void multi(int n1, int n2) {
        System.out.println("곱하기 : " + (n1 * n2));
    }

    // divide
    void divde(int n1, int n2) {
        System.out.println("divide : " + (n1 / n2));
    }
}

public class Meth02 {
    public static void main(String[] args) {
        Cal02 c1 = new Cal02();
        c1.add(10, 5); // . -> 객체 연결 연산자
        c1.minus(10, 5);
        c1.multi(10, 5);
        c1.divde(10, 5);

    }
}
