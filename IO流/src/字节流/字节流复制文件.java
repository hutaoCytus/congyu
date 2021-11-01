package 字节流;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
* 使用文件字节流实现文件的复制
* */
public class 字节流复制文件 {
    public static void main(String[] args) throws Exception{
        //1创建流
        //1.1文件字节输入流
        FileInputStream fis=new FileInputStream("D:\\idea代码\\IO流\\src\\字节流\\输出流.java");
        //1.2文件字节输出流
        FileOutputStream fos=new FileOutputStream("D:\\idea代码\\IO流\\src\\字节流\\输出流1.java");
        //2一边度，一边写
        byte[]buf=new byte[1024];
        int count=0;
        while ((count=fis.read(buf))!=-1){
            fos.write(buf,0,count);
        }
        //3关闭
        fis.close();
        fos.close();
        System.out.println("复制完毕");
    }
}
