package 创建线程.案例;

public class Consume implements Runnable{
    private BreadCon con;

    public Consume(BreadCon con) {
        this.con = con;
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            con.output();
        }
    }
}
