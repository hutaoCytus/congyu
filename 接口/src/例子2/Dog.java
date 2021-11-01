package 例子2;

public class Dog extends Animal implements Swimable,Runnable{
     public void shout(){
         System.out.println("狗狗开始叫");
     }

    @Override
    public void run() {
        System.out.println("狗狗跑步。。");
    }

    @Override
    public void swim() {
        System.out.println("狗狗游泳。。");
    }
}
