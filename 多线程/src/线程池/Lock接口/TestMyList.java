package 线程池.Lock接口;

import java.util.Arrays;

public class TestMyList {
    public static void main(String[] args) throws Exception{
        MyList list=new MyList();
        Runnable r1=new Runnable() {
            @Override
            public void run() {
                list.add("hello");
            }
        };
        Runnable r2=new Runnable() {
            @Override
            public void run() {
                list.add("world");
            }
        };
        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(Arrays.toString(list.getStr()));
    }
}
