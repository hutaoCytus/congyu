package 创建线程;
/*
* 线程类*/
public class MyTread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <50; i++) {
            //this.getID获取线程id   this.getName 获取线程名称
            //第一种方式this.getID和this.getName   局限性：必须继承Thread类才能用
//            System.out.println("线程ID"+this.getId()+"线程名称:"+getName()+" 子线程===="+i);

            //第二种方式Thread.currentThread()获取当前线程
            System.out.println("线程ID:"+Thread.currentThread().getId()+" 线程名称："+Thread.currentThread().getName());
        }
    }
}
