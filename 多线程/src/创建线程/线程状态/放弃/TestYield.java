package 创建线程.线程状态.放弃;

public class TestYield {
    public static void main(String[] args) {
        YieldThread y1=new YieldThread();
        YieldThread y2=new YieldThread();


        y1.start();
        y2.start();
    }
}
