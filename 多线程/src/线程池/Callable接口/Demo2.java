package 线程池.Callable接口;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
* 使用线程池计算1-100的和
* */
public class Demo2 {
    public static void main(String[] args) throws Exception{
        //1创建线程池
        ExecutorService es=Executors.newFixedThreadPool(1);
        //2提交任务 Future表示要执行完任务的结果
        Future<Integer> future= es.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum=0;
                System.out.println(Thread.currentThread().getName()+"开始计算");
                for (int i = 1; i <= 100; i++) {
                    sum+=i;
                }
                return sum;
            }
        });
        //3获取结果
        System.out.println(future.get());
        //4关闭线程池
        es.shutdown();
    }
}
