package 静态内部类;

public class TestOhter {
    public static void main(String[] args) {
        //直接创建静态内部类对象
        Outer.Inner inner=new Outer.Inner();
        //调用方法
        inner.show();
    }
}
