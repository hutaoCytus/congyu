package 创建线程.线程状态.线程通信;

public class TestBank {
    public static void main(String[] args) {
        //创建银行卡
        BankCard1 card1=new BankCard1();
        //创建2个操作
        AddMoney add=new AddMoney(card1);
        SubMoney sub=new SubMoney(card1);

        //创建线程对象
        Thread chen=new Thread(add,"陈晨");
        Thread zhon=new Thread(sub,"红中");

        //启动
        chen.start();
        zhon.start();
    }
}
