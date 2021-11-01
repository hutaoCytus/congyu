package finals;
/*
 *final修饰类：最终类，不能被继承
 *final
 *
     final 放在class前面*/
public  class Car {
   final String brand="bao";//实例变量，不再提供默认值，必须赋值，并且只能赋值一次
   final static String ASSD="德国";//静态常量
//final方法：最终方法，不能被重写和覆盖，但可以被继承
    public final void run() {
        System.out.println("汽车正在前进....");
    }
}
