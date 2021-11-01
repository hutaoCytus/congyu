package 创建线程.继承Tread类.案例;

public class TestWin {
    public static void main(String[] args) {
        //创建4个线程对象
        TicketWin w1 = new TicketWin("第一窗口");
        TicketWin w2 = new TicketWin("第二窗口");
        TicketWin w3 = new TicketWin("第三窗口");
        TicketWin w4 = new TicketWin("第四窗口");
        w1.start();
        w2.start();
        w3.start();
        w4.start();
    }
}
