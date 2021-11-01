package 线程池.Lock接口;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
* ReentrantLock
* */
public class MyList {
    private Lock lock=new ReentrantLock();
    private String[] str={"A","B","","",""};
    private  int count=2;
    //创建锁
    public void add(String value){
        lock.lock();
        try {
            str[count]=value;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count++;
            System.out.println(Thread.currentThread().getName()+"添加了"+value);
        }finally {
            lock.unlock();
        }
    }
    public String[] getStr(){
        return str;
    }
}
