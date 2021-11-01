package static属性;

public class students {
    String name;
    int age;
    //学生数量  静态属性，属于整个类共有的属性
    static int count;
    public void show(){
        System.out.println(name+" "+age);
    }

    //创建静态方法
    public static void method1(){
        System.out.println("第一个静态方法");
        method2();
    }
    public  static void method2(){
        System.out.println("第二个静态方法");
    }
}
