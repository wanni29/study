package ex02;

public class Mem06 {
    public static void main(String[] args) {
        double area1 = (20 * 20 * 3.141592) * 2;
        double area2 = 3.141592 * 30 * 30;
        System.out.println("20cm 2개의 피자면적=" + area1);
        System.out.println("30cm 피자면적=" + area2);
        System.out.println((area1 > area2)? "2개의 20cm 피자면적" : "30cm 피자면적" );
    }
}
