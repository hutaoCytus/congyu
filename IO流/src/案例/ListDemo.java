package 案例;

import java.io.File;

public class ListDemo {
    public static void main(String[] args) {
//        listDir(new File("D:\\idea代码\\IO流\\src\\案例\\myFile"));
        deleteDir(new File("D:\\idea代码\\IO流\\src\\案例\\myFile"));
    }
    //1递归遍历文件夹
    public static void listDir(File dir){
          File[]files=dir.listFiles();
        System.out.println(dir.getAbsolutePath());
          if (files!=null&&files.length>0){
              for (File file:files) {
                  if (file.isDirectory()){
                      listDir(file);
                  }else {
                      System.out.println(file.getAbsolutePath());
                  }
              }
          }
    }
    //2递归删除文件夹
    public static void deleteDir(File dir){
          File[]files=dir.listFiles();
          if (files!=null&&files.length>0){
              for (File file:files
                   ) {
                  if (file.isDirectory()){
                      deleteDir(file);//递归
                  }else {
                      //删除文件
                      System.out.println(file.getAbsolutePath()+"删除"+file.delete());
                  }
              }
          }
        System.out.println(dir.getAbsolutePath()+"删除"+dir.delete());
    }
}
