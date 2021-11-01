package trycatch;

import java.util.Scanner;

public class trycatchfinally {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("请输入第一个数字");
            int a=sc.nextInt();//输入非数字时，出现异常，没有处理，程序中断
            System.out.println("请输入第二个数字");
            int b=sc.nextInt();//输入0时，出现异常，没有处理，程序中断
            System.out.println("结果："+a/b);
            //手动退出JVM，下面代码不会执行
//            System.exit(0);
        }catch (Exception e){//捕获 Exception：是所有异常的父类
            //处理
            System.out.println(e.getMessage());
        }finally {
            System.out.println("释放资源");
        }
    }
}
