package 创建线程.线程状态.休眠;

public class TestSleep {
    public static void main(String[] args) {
        SleepThread s1=new SleepThread();
        s1.start();
        SleepThread s2=new SleepThread();
        s2.start();
    }
}
