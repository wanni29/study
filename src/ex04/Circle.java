package ex04;

public class Circle {
    int radius;
    String color;

    public double getArea() {
        return 3.14 * radius * radius; // 결과값을 double로 설정했기때문에
                                       // return 값도 double로 와야한다.
    }

}
