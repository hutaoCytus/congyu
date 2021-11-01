package 创建线程.线程状态.加入;

public class JoinThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println(Thread.currentThread().getName()+"......."+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
