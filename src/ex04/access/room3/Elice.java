package ex04.access.room3;

public class Elice {
    private int height = 160; // 니가 현장에 갔는데 니 선임이 값을 고정해 놨어
    // 그리고 엘리스 버섯 매겨가지고 키 180만들어 놔라 했단말이야
    // 그때 넌 어떻게할래 ?

    public void eat() {
        height = height + 10;
    }

    public void print() {
        System.out.println(height); // 선임이 만들어 놓은 코드 잘봐리,
                                    // 특히나 접근제한자나 메소드나 클래스가
                                    // 선언된 이유 하나하나를 사소하게 넘어가지마라!
    }

}
