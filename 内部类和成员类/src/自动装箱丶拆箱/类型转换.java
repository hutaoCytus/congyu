package 自动装箱丶拆箱;

public class 类型转换 {
    public static void main(String[] args) {
    int age=30;
    //自动装箱
    Integer integer4=age;
        System.out.println("自动装箱");
        System.out.println(integer4);
    //自动拆箱
    int age2=integer4;
        System.out.println("自动拆箱");
        System.out.println(age2);


        //基本类型和字符串之间的转换
        //1基本类型转成字符串
        int n1=255;
        //1.1使用＋号
        String s1=n1+"";
        //1.2使用Integer中的toString()方法
        String s2=Integer.toString(n1,1);//Integer.toString(int,radix: )radix代表把数字转化成几进制
        System.out.println(s1);
        System.out.println(s2);
        //2字符串转成基本类型
        String str="150";
        //使用Integer.parseXXX();
        int n2=Integer.parseInt(str);
        System.out.println(n2);

        //Boolean字符串转成基本类型:"true"-->true   非"true"-->false
        String str2="true";
        String str3="ssss";
        boolean b1=Boolean.parseBoolean(str2);
        boolean b2=Boolean.parseBoolean(str3);
        System.out.println(str2);
        System.out.println(str3);

    }
}
