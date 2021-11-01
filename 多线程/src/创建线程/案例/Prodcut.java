package 创建线程.案例;

public class Prodcut implements Runnable{
    private BreadCon con;

    public Prodcut(BreadCon con) {
        this.con = con;
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
           con.input(new Bread(i,Thread.currentThread().getName()));
        }
    }
}
