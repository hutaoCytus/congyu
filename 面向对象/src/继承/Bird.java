package 继承;

public class Bird extends Animal{
    //毛色
    String funcolor;

    //飞
    public void fly(){
        System.out.println("飞");
    }
    /*方法覆盖原则:
     方法名称，参数列表，返回值类型必须与父亲相同
     访问修饰符不能比父类严格

     方法覆盖的执行:
     子类覆盖父类方法后，调用时优先执行子类覆盖后的方法
     */
    @Override//注解:验证是否遵循重写的规则
    public void eat(){
        System.out.println("鸟在享用美味的午餐");
    }
}
