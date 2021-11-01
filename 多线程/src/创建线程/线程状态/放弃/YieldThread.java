package 创建线程.线程状态.放弃;

public class YieldThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+"......"+i);
            //主动放弃Cpu
            Thread.yield();
        }
    }
}
