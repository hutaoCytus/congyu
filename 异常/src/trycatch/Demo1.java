package trycatch;

import java.util.Scanner;

/*
* 演示try...catch...语句的使用
* try{....可能发生异常的代码}
* catch{...捕获异常并处理异常}
* 三种情况：
* 1正常，没有发生异常
* 2发生异常并捕获
* 3发生异常，不能捕获(一般是异常类型不匹配)
* */
public class Demo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       try {
           System.out.println("请输入第一个数字");
           int a=sc.nextInt();//输入非数字时，出现异常，没有处理，程序中断
           System.out.println("请输入第二个数字");
           int b=sc.nextInt();//输入0时，出现异常，没有处理，程序中断
           System.out.println("结果："+a/b);
       }catch (Exception e){//捕获 Exception：是所有异常的父类
           //处理
           e.printStackTrace();
       }
    }
}
