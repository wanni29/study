package practice2;

public class RareItem {
    public static void main(String[] args) {
        wear(2400, 2400);
        wear(3800, 1200);
    }

    public static void wear(int hp, int mp) {
        // 해당 메소드를 만드세요!
        if (hp >= 2000 && mp >= 2000)
            System.out.println("아이템 장착완료 !!");
        else
            System.out.println("아이템을 착용할수 없습니다.");
    }
}