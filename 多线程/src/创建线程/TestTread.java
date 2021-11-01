package 创建线程;

public class TestTread {
    public static void main(String[] args) {
        //1.创建线程对象
        MyTread myTread=new MyTread();
        //2.启动线程,不能调用run方法
        myTread.start();

        //创建第二个线程对象
        MyTread myTread1=new MyTread();
        myTread1.start();
        //主线程执行
        for (int i=0;i<50;i++){
            System.out.println("主线程========"+i);
        }
    }
}
