public class Person {
    String name;

    //静态成员
    static  int max=0;

    //静态代码块：类加载的时候，则执行静态代码块，只执行一次
    static {
        max=1000;
        System.out.println("人的最大数量："+max);
    }

    //静态方法
    public static void method(){

    }
}
