package 字符流;

import java.io.FileReader;
import java.io.FileWriter;

/*
* 使用FileReader和FileWriter复制文本文件，不能复制图片或二进制文件*/
public class 字符流复制文件 {
    public static void main(String[] args) throws Exception{
        //1创建FileReader和FileWriter
        FileReader fr=new FileReader("D:\\idea代码\\IO流\\src\\字符流\\hello.txt");
        FileWriter fw=new FileWriter("D:\\idea代码\\IO流\\src\\字符流\\hello1.txt");
        //2读写
        int date=0;
        while ((date= fr.read())!=-1){
                fw.write(date);
        }
        //3关闭
        fr.close();
        fw.close();
        System.out.println("复制完毕");
    }
}
