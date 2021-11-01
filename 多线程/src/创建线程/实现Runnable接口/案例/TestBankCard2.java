package 创建线程.实现Runnable接口.案例;

public class TestBankCard2 {
    public static void main(String[] args) {
        BackCard card=new BackCard();
        //存钱
        Runnable add=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <10; i++) {
                    card.setMoney((card.getMoney()+1000));
                    System.out.println(Thread.currentThread().getName()+"存了1000，余额是"+card.getMoney());
                }
            }
        };
        //取钱
        Runnable sub=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <10 ; i++) {
                    if (card.getMoney()>=1000) {
                        card.setMoney(card.getMoney() - 1000);
                        System.out.println(Thread.currentThread().getName() + "花了500，余额是" + card.getMoney());
                    }else {
                        System.out.println("余额不足");
                    }
                }
            }
        };
        //创建线程对象并启动
        new Thread(add,"陈").start();
        new Thread(sub,"中").start();
    }
}
