package 匿名内部类;

public class TestUSB{
    public static void main(String[] args) {
        //创建接口类型的变量
//        USB usb=new Mouse();
//        usb.service();

        //局部内部类
//        class fan implements USB{
//            @Override
//            public void service() {
//                System.out.println("链接成功，风扇开始工作");
//            }
//        }
//
//        //使用局部内部类创建对象
//        USB usb=new fan();
//        usb.service();


        //使用匿名内部类优化(相当创建了一个局部内部类)
        USB usb=new USB() {
            @Override
            public void service() {
                System.out.println("链接成功，风扇开始工作");
            }
        };
        usb.service();
    }
}
