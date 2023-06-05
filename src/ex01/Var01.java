package ex01;

public class Var01 {
    public static void main(String[] args) {
        int n1 = 7;                         // 저장공간은 4바이트(43억) -> 연속된 공간에 저장이 되어야 한다. 
        System.out.println(n1);             // n1앞에는 인덱스번호가 숨겨져있어서 컴퓨터가 그 값을 찾아갈수 있게 해뒀다고 생각하자.
        n1 = 20;                            // 변수의초기화  = 어사인 (int : 4바이트 공간을 확보해! n1 이라는 인덱스 위를 1로 설정)
        System.out.println(n1);             // 공간이 확보되다라는 개념 !
    }                                       
}
