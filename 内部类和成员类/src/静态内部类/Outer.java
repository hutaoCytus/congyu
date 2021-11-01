package 静态内部类;

public class Outer {
    private String name="xxx";
    private int age=18;

    //静态内部类：和外部类相同
    static class Inner{
       private String address="上海";
       private String phone="111";
       //静态成员
        private static int count=1000;

        public void show(){
            //调用外部内的属性
            //1创建外部内对象
            Outer outer=new Outer();
            //2调用外部内对象的属性
            System.out.println(outer.name);
            System.out.println(outer.age);
            //调用静态内部类的属性和方法
            System.out.println(address);
            System.out.println(phone);
            //调用静态内部类的静态属性
            System.out.println(count);
        }
    }
}
