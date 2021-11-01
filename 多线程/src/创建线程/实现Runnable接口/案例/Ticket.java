package 创建线程.实现Runnable接口.案例;
/*票类(共享资源)
* */
public class Ticket implements Runnable{
       private int ticket=100;
       //创建锁
       private Object obj=new Object();
    @Override
    public void run() {
        while (true){
            synchronized (this) {
                if (ticket<=0){
                    break;
                }
                System.out.println(Thread.currentThread().getName()+"买了第"+ticket+"张票");
                ticket--;
            }
        }
    }
}
