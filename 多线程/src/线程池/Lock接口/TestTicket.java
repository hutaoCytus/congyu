package 线程池.Lock接口;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestTicket {
    public static void main(String[] args) {
        Ticket t1=new Ticket();
        ExecutorService ex= Executors.newFixedThreadPool(4);
        for (int i = 0; i < 4; i++) {
            ex.submit(t1);
        }
        ex.shutdown();
    }
}
