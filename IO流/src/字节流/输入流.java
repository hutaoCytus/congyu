package 字节流;

import java.io.FileInputStream;

/*
* 演示FileInputStream的使用
* 文件字节输入流*/
public class 输入流 {
    public static void main(String[] args) throws Exception{
        //1创建FileInputStream
        FileInputStream fis=new FileInputStream("D:\\idea代码\\IO流\\src\\字节流\\aaa.txt");
        //2读取文件
        //2.1读取单个字节
//        int date=0;
//        while ((date=fis.read())!=-1){
//            System.out.print((char) date);
//        }

        //2.2一次读取多个字节
        byte[] buf=new byte[1024];
        int count=0;
        while ((count=fis.read(buf))!=-1){
            System.out.println(new String(buf,0,count));
        }


        fis.close();
        System.out.println("\n执行完毕");
    }
}
