package 创建线程.线程状态.优先级;

public class PriorityThread extends Thread{
    public PriorityThread(String name){
           super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"=-=-=-="+i);
        }
    }
}
