package practice;

class Television {
    private int channel;
    private int volume;
    private boolean onOff;

    Television(int c, int v, boolean o) {
        channel = c;
        volume = v;
        onOff = o;
    }

    void print() {
        System.out.println("채널은" + channel + "이고 볼륨은" + volume + "입니다.");
    }
}

public class TelevisionTest {
    public static void main(String[] args) {
        Television television = new Television(7, 10, true);
        television.print();

        Television yourTelevision = new Television(11, 20, true);
        yourTelevision.print();
    }
}
