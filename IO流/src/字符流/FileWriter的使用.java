package 字符流;

import java.io.FileWriter;

public class FileWriter的使用 {
    public static void main(String[] args) throws Exception{
        //1创建FileWriter对象
        FileWriter fw=new FileWriter("D:\\idea代码\\IO流\\src\\字符流\\hello.txt");
        //2写入
        for (int i = 0; i < 5; i++) {
            fw.write(12);
            fw.write("测试");
            fw.write("sssss");
            fw.write(12);
        }
        //3关闭
        fw.close();
        System.out.println("执行完毕");
    }
}
