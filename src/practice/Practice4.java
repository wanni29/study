package practice;

public class Practice4 {
    public static void main(String[] args) {

        for (int j = 1; j < 6; j++) {
            if (j == 4)
                continue;
            System.out.print(j);
        }

        System.out.println();

        for (int i = 1; i < 6; i++) {
            if (i == 4)
                break;
            System.out.print(i);
        }
    }
}
