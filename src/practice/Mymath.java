package practice;

public class Mymath {

    int add(int x, int y) {
        return x + y;
    }

    int add(int x, int y, int z) {
        return x + y + z;
    }

    int add(int x, int y, int z, int w) {
        return x + y + z + w;
    }

    class yourmath {

    }

    public static void main(String[] args) {
        Mymath mymath = new Mymath();
        System.out.println(mymath.add(10, 20));
        System.out.println(mymath.add(10, 20, 30));
        System.out.println(mymath.add(10, 20, 30, 40));
    }
}
