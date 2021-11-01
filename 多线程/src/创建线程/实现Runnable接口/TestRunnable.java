package 创建线程.实现Runnable接口;

public class TestRunnable {
    public static void main(String[] args) {
//        //1创建MyRunnable对象，表示线程要执行的功能
//        MyRunnable runnable=new MyRunnable();
//        //2创建线程对象
//        Thread thread=new Thread(runnable,"线程一");
//        //3启动
//        thread.start();
//
//        for (int i = 0; i < 50; i++) {
//            System.out.println("main....."+i);
//        }
        //使用匿名内部类
        //创建可运行对象
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <100 ; i++) {
                    System.out.println(Thread.currentThread().getName()+" ...."+i);
                }
            }
        };
        Thread thread=new Thread(runnable,"我的线程1");
        thread.start();
    }
}
