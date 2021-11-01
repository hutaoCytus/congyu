package 创建线程.实现Runnable接口.案例;

public class SubMoney implements Runnable{
    private BackCard Card;

    public SubMoney(BackCard Card) {
        this.Card = Card;
    }

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            if (Card.getMoney()>=1000) {
                Card.setMoney(Card.getMoney() - 500);
                System.out.println(Thread.currentThread().getName() + "花了500，余额是" + Card.getMoney());
            }else {
                System.out.println("余额不足");
            }
        }
    }
}
