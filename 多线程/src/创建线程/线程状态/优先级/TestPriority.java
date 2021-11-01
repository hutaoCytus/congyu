package 创建线程.线程状态.优先级;

public class TestPriority {
    public static void main(String[] args) {
        PriorityThread p1=new PriorityThread("线程p1");
        PriorityThread p2=new PriorityThread("线程p2");
        PriorityThread p3=new PriorityThread("线程p3");

        p1.setPriority(1);//setPriority通过对象调用，里面是优先级，1最低，10最高
        p2.setPriority(10);
        //启动
        p1.start();
        p2.start();
        p3.start();
    }
}
