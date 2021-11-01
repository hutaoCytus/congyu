package 创建线程.线程安全问题.同步方法;
/*票类(共享资源)
* */
public class Ticket implements Runnable{
       private int ticket=100;
       //创建锁
//       private Object obj=new Object();

    @Override
    public void run() {
        while (true){
             if (!sale()){
                 break;
             }
        }
    }
    //买票(同步方法)
    public synchronized boolean sale(){//锁：this代表当前对象
            if (ticket<=0){
                return false;
            }
            System.out.println(Thread.currentThread().getName()+"买了第"+ticket+"张票");
            ticket--;
         return true;
    }
}
