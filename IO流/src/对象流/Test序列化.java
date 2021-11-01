package 对象流;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
/*
* 使用ObjectOutputStream实现对象的序列化
* 注意事项：
* (1)序列化类必须要实现Serializable接口
* (2)序列化类中对象属性要求实现Serializable接口
* (3)如果有不想序列化的属性，使用transient修饰，这个属性就不能序列化
* (4)静态成员不能序列化
* (5)序列化多个对象可以借助集合实现
* */
public class Test序列化 {
    public static void main(String[] args) throws Exception{
        //1创建对象流
        FileOutputStream fos=new FileOutputStream("D:\\idea代码\\IO流\\src\\对象流\\stu.txt");
        ObjectOutputStream obs=new ObjectOutputStream(fos);
        //2序列化(就是写入操作)
        序列化 zhangsan=new 序列化("张三",20);
        obs.writeObject(zhangsan);
        obs.close();
        System.out.println("序列化完成");
    }
}
