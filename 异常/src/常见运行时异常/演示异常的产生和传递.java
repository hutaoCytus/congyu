package 常见运行时异常;

import java.util.Scanner;

/*
* 演示异常的产生的传递
* 要求：输入两个数字实现两个数字相除*/
public class 演示异常的产生和传递{
    public static void main(String[] args) {
        operation();
    }
    public static void operation(){
        System.out.println("operation");
               divide();
    }
    public static void divide(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int a=sc.nextInt();//输入非数字时，出现异常，没有处理，程序中断
        System.out.println("请输入第二个数字");
        int b=sc.nextInt();//输入0时，出现异常，没有处理，程序中断
        System.out.println("结果："+a/b);
    }
}
