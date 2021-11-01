package 字符流;

import java.io.BufferedReader;
import java.io.FileReader;

/*
* 使用字符缓冲流读取文件
* BufferedReader*/
public class BufferedReader的使用 {
    public static void main(String[] args) throws Exception{
        //1创建缓冲流
        FileReader fr=new FileReader("D:\\idea代码\\IO流\\src\\字符流\\hello1.txt");
        BufferedReader br=new BufferedReader(fr);
        //2读取
        //2.1第一种
//        char[] buf=new char[1024];
//        int date=0;
//        while ((date= br.read(buf))!=-1){
//            System.out.println(new String(buf,0,date));
//        }
        //2.2第二种，一行一行的读取
        String lin=null;
        while ((lin= br.readLine())!=null){
            System.out.println(lin);
        }
        //3关闭
        br.close();
    }
}
