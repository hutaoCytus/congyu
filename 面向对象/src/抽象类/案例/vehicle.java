package 抽象类.案例;
/*
 *交通工具类
 */
public class vehicle {
    private String brand;
    public vehicle(){

    }
    public vehicle(String brand){
        super();
        this.brand=brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    //前进
    public void run(){
        System.out.println("交通工具在前进");
    }
}
