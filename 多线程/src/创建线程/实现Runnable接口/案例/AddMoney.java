package 创建线程.实现Runnable接口.案例;

public class AddMoney implements Runnable{
    private BackCard card;
    public AddMoney(BackCard card) {
        this.card = card;
    }

    @Override
    public void run() {
        for (int i = 0; i <10; i++) {
            card.setMoney((card.getMoney()+1000));
            System.out.println(Thread.currentThread().getName()+"存了1000，余额是"+card.getMoney());
        }
    }
}
