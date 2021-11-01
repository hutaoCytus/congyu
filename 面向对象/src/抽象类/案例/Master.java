package 抽象类.案例;

public class Master {
             private String name;
             public Master(){

             }

    public Master(String name) {
            super();
            this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void goHome(vehicle vehicle){
        System.out.println(this.name+"下班回家了。。。。");
        vehicle.run();
    }
}
