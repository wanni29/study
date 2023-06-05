package practice;

class Pizza {
    int size;
    String type;

    public Pizza() {
        size = 12;
        type = "슈퍼슈프림";
    }

    public Pizza(int s, String t) {
        size = s;
        type = t;
    }
}

public class PizzaTest {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        System.out.println("(" + pizza.type + " , " + pizza.size + ")");

        Pizza pizzza = new Pizza(24, "포테이토");
        System.out.println("(" + pizzza.type + " , " + pizzza.size + ")");
    }
}