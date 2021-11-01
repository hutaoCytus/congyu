package 创建线程.线程安全问题.同步代码块.案例;

public class BankCard {
    private int money;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
