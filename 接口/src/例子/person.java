package 例子;

public class person implements fly,fire,sleep{
    String name;
    int age;
    public person(String name,int age) {
          this.name=name;
          this.age=age;
    }

    @Override
    public void sleep() {
        System.out.println(age+"的"+name+"睡觉"+"睡死了");
    }

    public person() {
    }
    public void ect(){
        System.out.println("吃");
    }


    @Override
    public void fiy() {
        System.out.println(name+"在"+age+"开始飞了");
    }

    @Override
    public void fire() {
        System.out.println(name+"在"+age+"可以喷火");
    }
}
