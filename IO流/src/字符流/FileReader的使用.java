package 字符流;

import java.io.FileReader;

/*
* 使用FileReader读取文件
* */
public class FileReader的使用 {
    public static void main(String[] args) throws Exception{
        //1创建FileReader  文件字符输入流
        FileReader fr=new FileReader("D:\\idea代码\\IO流\\src\\字符流\\hello.txt");
        //2读取
        // 2.1单个字符读取
//        int date=0;
//        while ((date=fr.read())!=-1){
//            System.out.println((char)date);
//        }
        //使用字符缓冲区读取
        char[]buf=new char[1024];
        int count=0;
        while ((count= fr.read(buf))!=-1){
            System.out.println(new String(buf,0,count));
        }
    }
}
