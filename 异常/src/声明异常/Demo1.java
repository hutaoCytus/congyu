package 声明异常;

import java.util.Scanner;
/*
* throws:声明异常*/
public class Demo1 {
    public static void main(String[] args) throws Exception{//不行写try...catch也行，在main上面再声明异常,这样异常就好抛出给JVM处理
        try {//处理异常的方法：try...catch
            divide();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public  static void divide() throws Exception{//在声明异常后，要在调用这个方法的位置处理这个声明的异常，不然不能运行
        Scanner sc=new Scanner(System.in);
            System.out.println("请输入第一个数字");
            int a=sc.nextInt();//输入非数字时，出现异常，没有处理，程序中断
            System.out.println("请输入第二个数字");
            int b=sc.nextInt();//输入0时，出现异常，没有处理，程序中断
            int result=a/b;
            System.out.println("结果："+result);
    }
}
