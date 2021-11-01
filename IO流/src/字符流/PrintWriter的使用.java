package 字符流;

import java.io.PrintWriter;

/*
* 演示PrintWriter的使用*/
public class PrintWriter的使用 {
    public static void main(String[] args) throws Exception{
        //1创建打印流
        PrintWriter pw=new PrintWriter("D:\\idea代码\\IO流\\src\\字符流\\print.txt");
        //2打印
        pw.println(12);
        pw.println("str");
        pw.println("测试");
        pw.println(3.14);
        pw.println('a');
        //3关闭
        pw.close();
        System.out.println("执行完毕");
    }
}
