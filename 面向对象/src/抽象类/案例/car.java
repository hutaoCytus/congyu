package 抽象类.案例;

public class car  extends vehicle{
    public car(){

    }

    public car(String brand) {
        System.out.println(super.getBrand()+"牌的自行车正在前进...");
    }

    @Override
    public void run() {
        System.out.println();
    }
}
