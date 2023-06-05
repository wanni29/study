package ex03;

public class While01 {
    public static void main(String[] args) {
        // for => 끝이 있는 반복문 : 끝을 알면 for를 돌리고
        // while => 끝을 모르는 반복문 : 끝을 모르면 while를 돌려라

        int i = 1;
        while (true) { // 끝이 없는 프로그램 : 데몬 프로세스

            if (i == 101) {
                break;
            }

            System.out.println("Hello world : " + i);
            i++; // i = i + 1;
        }
    }

}
