package 继承3;

public class son extends father{
    int value=200;
    @Override
    public void show() {
        super.show();//调用父类的show方法
        System.out.println("son的show方法");
    }
    public void print(){
        int value=300;
        System.out.println(value);//局部遍历
        System.out.println(this.value);//本类的实例变量
        System.out.println(super.value);//父类的实例变量
    }
}
