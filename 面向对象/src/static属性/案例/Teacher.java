package static属性.案例;

public class Teacher {
    //姓名
    String name;
    //年龄
    int age;
    //工资
    double salary;

    //保存对象创建的次数
    static int count=0;

    public Teacher() {
        Teacher.count++;
    }

    public void show(){
        System.out.println(name+"---"+age+"---"+"---"+salary);
    }
}
