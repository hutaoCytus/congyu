package usb案例;

public class Test {
    public static void main(String[] args) {
        computer lenovo=new computer();
        Usb mouse=new Mouse();
        Usb fan=new Ufan();
        Usb usb=new Upan();

        //连接usb设备到电脑上

        lenovo.usb1=usb;
        lenovo.usb2=mouse;
        lenovo.usb3=fan;
        lenovo.run();
    }
}
