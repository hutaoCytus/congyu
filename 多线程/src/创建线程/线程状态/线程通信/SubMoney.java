package 创建线程.线程状态.线程通信;

public class SubMoney implements Runnable{
    private BankCard1 card;

    public SubMoney(BankCard1 card) {
        this.card = card;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
          card.take(1000);
        }
    }
}
