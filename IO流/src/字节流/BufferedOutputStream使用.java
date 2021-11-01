package 字节流;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/*
 * 使用字节换冲流写入文件
 * BufferedOutputStream
 * */
public class BufferedOutputStream使用 {
    public static void main(String[] args) throws Exception{
        //1.创建字节输出缓冲流
        FileOutputStream fos=new FileOutputStream("D:\\idea代码\\IO流\\src\\字节流\\Buffer.txt",true);
        BufferedOutputStream buf=new BufferedOutputStream(fos);
        //2.写入文件
        for (int i = 0; i < 10; i++) {
            buf.write("测试\n".getBytes());//当字节小于8k是，会写入缓冲区
            buf.flush();//刷新到硬盘
        }
        //3关闭(会自动调用close方法)
        buf.close();
    }
}
