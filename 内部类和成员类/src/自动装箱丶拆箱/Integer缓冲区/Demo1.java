package 自动装箱丶拆箱.Integer缓冲区;

public class Demo1 {
    public static void main(String[] args) {
        //面试题
        Integer integer1=new Integer(100);
        Integer integer2=new Integer(100);
        System.out.println(integer1=integer2);//false

        Integer integer3=100;//自动装箱:调用Integer.valueOf方法
        Integer integer4=100;
        System.out.println(integer3=integer4);//true

        Integer integer5=200;//自动装箱
        Integer integer6=200;
        System.out.println(integer5=integer6);//false
    }
}
