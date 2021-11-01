package 字符流;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriter的使用 {
    public static void main(String[] args) throws Exception{
        //1创建缓冲流
        FileWriter fw=new FileWriter("D:\\idea代码\\IO流\\src\\字符流\\hello1.txt",true);
        BufferedWriter bw=new BufferedWriter(fw);
        //2写入
        for (int i=0;i<5;i++) {
            bw.write("测试类1");
            bw.newLine();//写入一个换行符
        }
        System.out.println("写入完毕");
        //3关闭
        bw.close();
    }
}
