package 创建线程.线程状态.死锁;

public class Girl extends Thread{
    @Override
    public void run() {
        synchronized (MyLock.b){
            System.out.println("女孩拿到了b");
            synchronized (MyLock.a){
                System.out.println("女孩拿到了a");
                System.out.println("女孩可以吃东西了");
            }
        }
    }
}
