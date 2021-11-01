package File类;

import java.io.File;
import java.io.FileFilter;
import java.util.Date;

/*
* File类的使用
* (1)分隔符
* (2)文件操作
* (3)文件夹操作
* */
public class 文件操作 {
    public static void main(String[] args) throws Exception{
        separator();
        fileOpe();
        directoryOpe();
    }
    //(1)分隔符
    public static void separator(){
        System.out.println("路径分隔符:"+ File.pathSeparator);
        System.out.println("名称分隔符:"+File.separator);
    }
    //(2)文件操作
    public static void fileOpe()throws Exception{
        //1创建文件
        File file=new File("D:\\idea代码\\IO流\\src\\File类\\file.txt");
        if (!file.exists()) {
            boolean b=file.createNewFile();//如果文件存在则不会再创建
            System.out.println("创建文件结果："+b);
        }
        //2删除文件
        //2.1直接删除
//        System.out.println("删除结果："+file.delete());
        //2.2使用jvm退出时删除
//        file.deleteOnExit();
//        Thread.sleep(2000);

        //3获取文件信息
        System.out.println("获取文件的绝对路径"+file.getAbsolutePath());
        System.out.println("获取路径"+file.getPath());
        System.out.println("获取文件名称"+file.getName());
        System.out.println("获取父目录"+file.getParent());
        System.out.println("获取文件长度"+file.length());
        System.out.println("获取文件创建时间"+new Date(file.lastModified()).toString());

        //4判断
        System.out.println("判断文件是否可写："+file.canWrite());
        System.out.println("判断是否为文件："+file.isFile());
        System.out.println("判断是否隐藏"+file.isHidden());
    }
    //(3)文件夹操作
    public static void directoryOpe()throws Exception{
        //1创建文件夹
        File dir=new File("D:\\idea代码\\IO流\\src\\File类\\text");
        if (!dir.exists()) {
//            dir.mkdir();//只能创建单极目录
            System.out.println("创建文件夹结果："+dir.mkdirs());//创建多级目录
        }

        //2删除文件夹
        //2.1直接删除
//        System.out.println("删除结果："+dir.delete());//文件夹必须是空目录
        //2.2使用jvm退出删除
//        dir.deleteOnExit();
//        Thread.sleep(3000);

        //3获取文件夹信息
        System.out.println("获取文件夹的绝对路径:"+dir.getAbsolutePath());
        System.out.println("获取文件夹的路径:"+dir.getPath());
        System.out.println("获取文件夹名称:"+dir.getName());
        System.out.println("获取文件夹的父目录:"+dir.getParent());
        System.out.println("获取文件夹的创建时间:"+new Date(dir.lastModified()).toString());

        //4判断
        System.out.println("是否为文件夹"+dir.isDirectory());
        System.out.println("是否为隐藏文件夹"+dir.isHidden());

        //5遍历文件夹
        File dir2=new File("D:\\idea代码\\IO流\\src\\字符流");
        String[] files=dir2.list();
        System.out.println("-----------文件夹遍历--------------");
        for (String str:files
             ) {
            System.out.println(str);
        }
        System.out.println("--------File Filter接口的使用");
        File[]files1=dir2.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.getName().endsWith(".java")){
                    return true;
                }
                return false;
            }
        });
        for (File file: files1) {
            System.out.println(file.getName());
        }
    }
}
