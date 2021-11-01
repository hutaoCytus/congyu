package 局部内部类;

public class Outer {
    private String name="ldh";
    private int age=18;

    public void show(){
        //定义局部变量
        String address="sz";

        //局部内部类:不能加任意访问修饰符
        class Inner{
            private String phone="158882";
            private String emali="liudehua@qq.com";

            public void show2(){
                //访问外部类属性
                System.out.println(name);
                System.out.println(age);
                //访问内部类属性
                System.out.println(phone);
                System.out.println(emali);
                //访问局部变量
                System.out.println(address);
            }
        }
        //创建内部类对象
        Inner inner=new Inner();
        inner.show2();
    }
}
