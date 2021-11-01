package 创建线程.继承Tread类.案例;

public class TicketWin extends Thread{
    public TicketWin(String name){
            super(name);
    }
    private int ticket=100;//票
    @Override
    public void run() {
        while (true){
            if (ticket<=0){
                break;
            }
            System.out.println(Thread.currentThread().getName()+" 卖了第"+ticket+"张票");
           ticket--;
        }
    }
}
