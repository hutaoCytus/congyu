package 成员内部类;
public class Outher {
    //实例变量
    private String name="张三";
    private int age=20;

    //内部类
    class Inner{
        private String address="北京";
        private String phone="110";

        //方法
        public void show(){
            //打印外部类的属性
            System.out.println(name);
            System.out.println(age);
            //打印内部类的属性
            System.out.println(address);
            System.out.println(phone);
        }
    }
}
