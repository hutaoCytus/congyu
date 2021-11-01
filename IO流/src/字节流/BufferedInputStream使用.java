package 字节流;
/*
* 使用字节换冲流读取文件
* BufferedInputStream
* */
import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStream使用 {
    public static void main(String[] args) throws Exception{
        //1创建BufferedInputStream
        FileInputStream fis=new FileInputStream("D:\\idea代码\\IO流\\src\\字节流\\aaa.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);
        //2读取
//        int date=0;
//        while ((date=bis.read())!=-1){
//            System.out.println((char)date);
//        }
        byte[] buf=new byte[1024];
        int count=0;
        while ((count= bis.read(buf))!=-1){
            System.out.println(new String(buf,0,count));
        }
        bis.close();
    }
}
