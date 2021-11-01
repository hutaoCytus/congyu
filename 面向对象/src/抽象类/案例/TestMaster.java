package 抽象类.案例;

public class TestMaster {
    public static void main(String[] args) {
        Master xiaoming=new Master("小明");
        vehicle car=new car("迪拜");
        xiaoming.goHome(car);
    }
}
