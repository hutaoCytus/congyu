package 创建线程.线程安全问题.同步代码块.案例;

import 创建线程.实现Runnable接口.案例.BackCard;

public class TestBankCard {
    public static void main(String[] args) {
        //1创建银行卡
        BackCard card=new BackCard();
        //2创建2个操作
        //2.1存钱
        Runnable add=new Runnable() {
            @Override
            public void run() {
                    for (int i=0;i<10;i++) {
                        synchronized (card) {
                            card.setMoney(card.getMoney() + 1000);
                            System.out.println(Thread.currentThread().getName() + "存了1000块,余额为" + card.getMoney());
                        }
                    }
            }
        };
        //2.2取钱
        Runnable sub=new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10;i++) {
                    synchronized (card) {
                        if (card.getMoney()<=500) {
                            System.out.println("余额不足");
                        }
                        else {
                            card.setMoney(card.getMoney() - 500);
                            System.out.println(Thread.currentThread().getName() + "用了500块，余额为" + card.getMoney());
                        }
                    }
                }
            }
        };
        Thread chen=new Thread(add,"陈");
        Thread zhon=new Thread(sub,"中");
        chen.start();
        zhon.start();
    }
}
