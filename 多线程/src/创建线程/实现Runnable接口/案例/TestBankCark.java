package 创建线程.实现Runnable接口.案例;

public class TestBankCark {
    public static void main(String[] args) {
        //1创建一张银行卡
        BackCard card=new BackCard();
        //2创建存钱，取钱
        AddMoney add=new AddMoney(card);
        SubMoney sub=new SubMoney(card);
        //3创建线程
        Thread chenchen=new Thread(add,"晨晨");
        Thread bingbing=new Thread(sub,"冰冰");
        //4启动线程
        chenchen.start();
        bingbing.start();
    }
}
