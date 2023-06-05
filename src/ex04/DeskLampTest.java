package ex04;

public class DeskLampTest {
    public static void main(String[] args) {

        DeskLamp myLamp = new DeskLamp();
        myLamp.turnOn();
        String result = myLamp.print();
        System.out.println(result);
        myLamp.turnOff();
        result = myLamp.print();
        System.out.println(result);
    }
}