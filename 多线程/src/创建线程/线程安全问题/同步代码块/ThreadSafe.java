package 创建线程.线程安全问题.同步代码块;

import java.util.Arrays;

public class ThreadSafe {
    private static int index=0;
    public static void main(String[] args) throws Exception{
        //创建数组
        String []s=new String[5];
        //创建两个操作
        Runnable a1=new Runnable() {
            @Override
            public void run() {
                //同步代码块
                synchronized (s) {
                    s[index]="hello";
                    index++;
                }
            }
        };

        Runnable a2=new Runnable() {
            @Override
            public void run() {
                synchronized (s) {
                    s[index]="world";
                    index++;
                }
            }
        };

        //创建线程对象
        Thread a=new Thread(a1,"A");
        Thread b=new Thread(a2,"B");
        a.start();
        b.start();

        a.join();//加入线程
        b.join();//

        System.out.println(Arrays.toString(s));
    }
}
