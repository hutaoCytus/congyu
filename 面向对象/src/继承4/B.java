package 继承4;

public class B extends A{
    int num3;
    public B(){
        super();//调用父类的无参构造方法，默认添加
        System.out.println("B的默认构造方法");
    }
    public B(int num1,int num2,int num3){
        //super();//父类的无参构造
        super(num1,num2);//调用父类的构造方法
        System.out.println("的带参构造方法");
        this.num3=num3;

    }
    public void m2(){
        System.out.println("B中的m2方法");
    }
}
