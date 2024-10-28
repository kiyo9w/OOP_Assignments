//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TV SamsungTV = new TV();
        SamsungTV.setChannel(45);
        SamsungTV.setVolume(25);
        SamsungTV.volumeUp();

        SamsungTV.turnOn();
        SamsungTV.setVolume(25);
        SamsungTV.volumeUp();
        SamsungTV.volumeDown();
        SamsungTV.channelDown();
        SamsungTV.channelUp();
        SamsungTV.setChannel(123);
        SamsungTV.setChannel(1230);
        SamsungTV.turnOff();
    }
}