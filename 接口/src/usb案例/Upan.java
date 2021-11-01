package usb案例;

public class Upan implements Usb{
    @Override
    public void service() {
        System.out.println("Upan链接电脑成功，开始工作..");
    }
}
