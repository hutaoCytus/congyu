package 创建线程.实现Runnable接口;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println(Thread.currentThread().getName()+" ...."+i);
        }
    }
}
