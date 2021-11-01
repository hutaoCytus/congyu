package 线程池.Lock接口.读写锁;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;
/*
* 演示读写锁的使用*/
public class ReadWriteDemo {
  //创建读写锁
    private ReentrantReadWriteLock rr1=new ReentrantReadWriteLock();
    //获取读锁
    private ReadLock r1=rr1.readLock();
    //获取写锁
    private WriteLock w1=rr1.writeLock();

    private String value;


    //读取
    public String getValue(){
        //使用读锁上锁
        r1.lock();
        try {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("读取:"+value);
            return this.value;
        } finally {
            r1.unlock();
        }
    }
    //写入
    public void setValue(String value){
        w1.lock();
        try {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("写入:"+value);
            this.value=value;
        } finally {
            w1.unlock();
        }
    }
}
