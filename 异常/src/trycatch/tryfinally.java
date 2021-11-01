package trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
* try..finally的使用
* 不能处理异常，可以释放资源，把异常向上抛出*/
public class tryfinally {
    public static void main(String[] args) {
        try {
            divide();
        }catch (Exception e){
            System.out.println("出现异常"+e.getMessage());
        }
    }
    public static void divide(){
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("请输入第一个数字");
            int a=sc.nextInt();//输入非数字时，出现异常，没有处理，程序中断
            System.out.println("请输入第二个数字");
            int b=sc.nextInt();//输入0时，出现异常，没有处理，程序中断
            System.out.println("结果："+a/b);
        }finally {
            System.out.println("释放资源");
        }
    }
}
