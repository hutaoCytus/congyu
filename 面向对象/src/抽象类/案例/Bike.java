package 抽象类.案例;

public class Bike extends vehicle{
    public Bike(){

    }

    public Bike(String brand) {
        super(brand);
    }

    @Override
    public void run() {
        System.out.println(super.getBrand()+"牌的自行车正在前进...");
    }
}
