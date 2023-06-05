package ex04;

public class Box {

    double multiBox(int x, int y, int z) {
        double result = x * y * z;
        System.out.println("상자의 가로, 세로, 높이는" + x + "," + y + "," + z + "입니다.");
        System.out.println("상자의 부피는" + result + "입니다.");
        return result;
    }

}
