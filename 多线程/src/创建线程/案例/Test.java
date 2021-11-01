package 创建线程.案例;

import java.util.concurrent.Executor;

public class Test{
    public static void main(String[] args) {
        //容器
        BreadCon con=new BreadCon();
        //生产和消费
        Prodcut prodcut=new Prodcut(con);
        Consume consume=new Consume(con);
        //创建线程对象
        Thread chenchen=new Thread(prodcut,"嗔恨");
        Thread bingbing=new Thread(consume,"小法");
        Thread mingming=new Thread(prodcut,"茗茗");
        Thread lili=new Thread(consume,"李丽");

        chenchen.start();
        bingbing.start();
        mingming.start();
        lili.start();
    }
}
