package 继承;

public class Dog extends Animal{//extends关键字：继承父类，左边是子类，右边是父类
                                //语法:class 子类 extends 父类     定义子类时显示父类
                                //应用:产生继承关系之后，子类可以使用父类中的属性和方法，也可定义子类独有的属性和方法
                                //好处:提高代码的复用性，又提高代码的可扩展性
    //毛色
    String funcolor;

    //睡
    public void run(){
        System.out.println("跑");
    }
}
