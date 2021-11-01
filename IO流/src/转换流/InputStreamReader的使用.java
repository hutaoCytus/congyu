package 转换流;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputStreamReader的使用 {
    public static void main(String[] args) throws Exception{
        //1创建InputStreamReader对象
        FileInputStream fis=new FileInputStream("D:\\idea代码\\IO流\\src\\字符流\\hello.txt");
        InputStreamReader isr=new InputStreamReader(fis,"UTF-8");
        //2读取文件
        int date=0;
        while ((date= isr.read())!=-1){
            System.out.println((char) date);
        }
        //3关闭
        isr.close();
    }
}
