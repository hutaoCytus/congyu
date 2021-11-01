package usb案例;

public class Ufan implements Usb{
    @Override
    public void service() {
        System.out.println("Ufan链接电脑成功，开始工作..");
    }
}
