package 方法覆盖声明异常方法;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("子类吃方法");
    }
}
