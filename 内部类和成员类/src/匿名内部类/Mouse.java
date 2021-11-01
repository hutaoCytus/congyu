package 匿名内部类;

public class Mouse implements USB{
    @Override
    public void service() {
        System.out.println("连接成功，鼠标开始工作");
    }
}
