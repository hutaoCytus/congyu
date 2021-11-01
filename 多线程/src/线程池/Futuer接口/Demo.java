package 线程池.Futuer接口;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo {
    public static void main(String[] args) throws Exception{
        ExecutorService es= Executors.newCachedThreadPool();
        Future<Integer> f1=es.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
               int sum=0;
                for (int i = 1; i <=50; i++) {
                    sum+=i;
                }
                return sum;
            }
        });
        Future<Integer> f2= es.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum=0;
                for (int i = 51; i <=100; i++) {
                    sum+=i;
                }
                return sum;
            }
        });
        System.out.println(f1.get()+f2.get());
        es.shutdown();
    }
}
