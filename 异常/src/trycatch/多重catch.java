package trycatch;

import java.awt.image.ImagingOpException;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
* 演示多重catch的使用
* try...catch(类型1)...catch(资源2)...*/
public class 多重catch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("请输入第一个数字");
            int a=sc.nextInt();//输入非数字时，出现异常，没有处理，程序中断
            System.out.println("请输入第二个数字");
            int b=sc.nextInt();//输入0时，出现异常，没有处理，程序中断
            System.out.println("结果："+a/b);
        }catch (ArithmeticException e){//捕获 Exception：是所有异常的父类
            //处理
            System.out.println("算数异常");
        }catch (InputMismatchException e){
            System.out.println("输入不匹配异常");
        }catch (Exception e){
            System.out.println("未知异常");
        }
    }
}
