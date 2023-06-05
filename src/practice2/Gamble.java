package practice2;

public class Gamble {
    public static void main(String[] args) {
        double dollar = dice() + dice() + dice();
        System.out.println(dollar);
        double won = exchange(dollar);
        System.out.println(won);
        System.out.printf("획득 금액 : $%.2f(%.0f원)", dollar, won);
    }

    public static int dice() {
        // Math 함수를 사용해서 1 ~ 6 사이값이 나올수있도록 만드시오
        return (int) (Math.random() * 7);
    }

    public static double exchange(double dollar) {
        // 입력받은 값을 달러로 환전하시오
        // 1달러 환율기준 1달러 = 1082.25108
        return (dollar * 1082.25108);
    }
}
