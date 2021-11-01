package Collection体系集合.List接口使用.泛型;

import Collection体系集合.List接口使用.泛型.泛型方法.MyGenericMethod;

public class TestGeneric {
    public static void main(String[] args) {

    //使用泛型类创建对象
    //注意：1.泛型只能使用引用类型。2.不同泛型对象不能复制
    MyGeneric<String> myGeneric=new MyGeneric<>();
    myGeneric.t="Hello";
    myGeneric.show("大家好");
    String string= myGeneric.getT();

    MyGeneric<Integer> myGeneric1=new MyGeneric<>();
    myGeneric1.t=200;
    myGeneric1.show(100);
    Integer integer=myGeneric1.getT();

    //泛型接口
    //方法1
        System.out.println("-----泛型接口-----");
    MyInterfacelmpl lmpl=new MyInterfacelmpl();
       lmpl.server("xxxxxxxxx");

    //方法2
    MyInterfacelmpl2<Integer> lmp2=new MyInterfacelmpl2<>();
       lmp2.server(1000);



    //泛型方法
        System.out.println("-----泛型方法-----");
    MyGenericMethod myGenericMethod=new MyGenericMethod();
    myGenericMethod.show("中国加油");
    myGenericMethod.show(100);
    //泛型show方法的T类型取决与传递的类型，传数字类型就是Integer，传字符串就是String；
    }
}
