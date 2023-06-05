package practice2;

public class Walking {
    public static void main(String[] args) {

        double result = calcurateCalory(5000);
        System.out.println(result + "kcal");

    }

    // 칼로리 메소드 계산기!
    private static double calcurateCalory(int walk) {
        return 0.02 * walk;
    }

}
