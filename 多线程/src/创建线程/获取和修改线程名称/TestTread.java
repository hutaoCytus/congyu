package 创建线程.获取和修改线程名称;
//修改线程名字有两种方式 一种是调用setName方法，一种是用带参构造函数
public class TestTread {
    public static void main(String[] args) {
        //1.创建线程对象
        MyTread myTread=new MyTread("我的子线程1");
        //2.启动线程,不能调用run方法
        //修改进程名称，要在线程启动前修改
//        myTread.setName("我的子线程1");
        myTread.start();

        //创建第二个线程对象
        MyTread myTread1=new MyTread();
        myTread1.setName("我的子线程2");
        myTread1.start();
        //主线程执行
        for (int i=0;i<50;i++){
            System.out.println("主线程========"+i);
        }
    }
}
