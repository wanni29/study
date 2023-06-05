package practice;

class Box {
    int width, height, depth;
}

public class BoxTest {
    public static void main(String[] args) {
        Box box = new Box();
        System.out.println("상자의 크기: (" + box.depth + "," + box.height + "," + box.depth + ")");
    }
}
