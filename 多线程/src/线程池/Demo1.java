package 线程池;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
* 演示线程池的创建
* Executor：线程池的根接口，execute()
*ExecutorService：包含管理线程池的一些方法.submit shutdown
*  ThreadPoolExecutor
*    ScheduledThreadPoolExecutor
* Executors:创建线程池的工具类
*     四种线程池：
* (1)创建固定线程个数的线程池:Executors.newFixedThreadPool(4);
* (2)创建缓存线程池，由任务的多少决定:Executors.newCachedThreadPool();
* (3)创建单线程池:Executors.newSingleThreadExecutor();
* (4)创建调度线程池:Executors.newScheduledThreadPool();    调度：周期，定时执行
* */
public class Demo1 {
    public static void main(String[] args) {
        //1创建缓存线程池，线程个数由任务个数决定
        ExecutorService es=Executors.newCachedThreadPool();
        //2创建任务
        Runnable runnable=new Runnable() {
        private int ticket=100;
            @Override
            public void run() {
                while (true) {
                    if (ticket<=0){
                        break;
                    }
                    System.out.println(Thread.currentThread().getName()+"卖了第"+ticket+"张票");
                    ticket--;
                }
            }
        };
        //3提交任务
        for (int i=0;i<4;i++) {
            es.submit(runnable);
        }
        //4关闭线程池
        es.shutdown();//等待所有任务执行完毕 然后关闭线程池    shutdownNow则不会等待任务执行完毕，而是马上关闭线程池
    }
}
