package 字节流;import java.io.FileOutputStream;/** 演示文件输出流的使用* FileOutputStream* */public class 输出流 {    public static void main(String[] args) throws Exception{        //1创建文件字节输出流对象        FileOutputStream fos=new FileOutputStream("D:\\idea代码\\IO流\\src\\字节流\\bbb.txt",true);        //2写入文件//        fos.write(97);//        fos.write('b');//        fos.write('c');        String str="666 ";        fos.write(str.getBytes());        //3关闭        fos.close();        System.out.println("执行完毕");    }}