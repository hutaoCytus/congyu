package 线程池.Lock接口.读写锁;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestReadWrite {
    public static void main(String[] args) {
        ReadWriteDemo readWriteDemo=new ReadWriteDemo();
        //创建线程池
        ExecutorService es= Executors.newFixedThreadPool(20);
        long starr=System.currentTimeMillis();
        //分配2个写的任务
        for (int i = 0; i < 2; i++) {
            es.submit(new Runnable() {
                @Override
                public void run() {
                  readWriteDemo.setValue("张三"+new Random().nextInt(100));
                }
            });
        }
        //分配18个读取任务
        for (int i = 0; i < 18; i++) {
            es.submit(new Runnable() {
                @Override
                public void run() {
                    readWriteDemo.getValue();
                }
            });
        }
        es.shutdown();
        while (!es.isTerminated()) {

        }
        long end=System.currentTimeMillis();
        System.out.println("用时"+(starr-end));
    }
}
