package 转换流;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/*
* 使用OutputStreamWriter写入文件，使用指定编码*/
public class OutputStreamWriter的使用 {
    public static void main(String[] args) throws  Exception{
        //1创建OutputStreamWriter
        FileOutputStream fos=new FileOutputStream("D:\\idea代码\\IO流\\src\\转换流\\info.txt",true);
        OutputStreamWriter osw=new OutputStreamWriter(fos,"gbk");
        //2写入
        for (int i = 0; i < 5; i++) {
               osw.write("我爱自由");
        }
        //3关闭
        osw.close();
        System.out.println("执行完毕");
    }
}
