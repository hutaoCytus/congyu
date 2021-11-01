package 创建线程.线程状态.死锁;

public class Boy extends Thread{
    @Override
    public void run() {
        synchronized (MyLock.a){
            System.out.println("男孩拿到了a");
            synchronized (MyLock.b){
                System.out.println("男孩拿到了b");
                System.out.println("男孩可以吃东西了");
            }
        }
    }
}
