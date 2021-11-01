package usb案例;

public class Mouse implements Usb{
    @Override
    public void service() {
        System.out.println("Mouse链接电脑成功，开始工作..");
    }
}
