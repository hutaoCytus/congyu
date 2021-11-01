package 对象流;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
/*
 * 使用ObjectInputStream实现对象的反序列化(读取并重构成对象)
 *
 * */
public class 反序列化 {
    public static void main(String[] args) throws Exception{
        //1创建流
        FileInputStream fis=new FileInputStream("D:\\idea代码\\IO流\\src\\对象流\\stu.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        //2读取文件(反序列化)
        序列化 x=(序列化)ois.readObject();
        //3关闭
        ois.close();
        System.out.println("执行完毕");
        System.out.println(x.toString());
    }
}
