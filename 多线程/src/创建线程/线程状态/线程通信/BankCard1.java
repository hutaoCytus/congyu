package 创建线程.线程状态.线程通信;

public class BankCard1 {
    //余额
    private double money;

    private boolean flag=false;//true表示有钱，可以执行取钱操作    false表示没钱，要进行存钱
    //存钱
    public synchronized void save(double m){
        if (flag){//表示有钱
            try {
                this.wait();//进入等待队列，同时释放锁和CPU
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        money=money+m;
        System.out.println(Thread.currentThread().getName()+"存了"+m+"余额为"+money);
        //修改标记
        flag=true;
        //唤醒取钱线程
        this.notify();
    }

    //取钱
    public synchronized void take(double m){
        if (!flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            money=money-m;
            System.out.println(Thread.currentThread().getName()+"取了"+m+"余额为"+money);
            //修改标记
            flag=false;
            //唤醒存钱线程
            this.notify();
        }
    }
}
