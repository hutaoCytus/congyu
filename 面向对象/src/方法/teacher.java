package 方法;

public class teacher {
    String name;
    int age;
    int salary;
    public void seyhi(){
        System.out.println("同学们好，我是"+name+"\n工资："+salary);
    }
    public  void know(student d){
        System.out.println(name+"要认识学生");
        d.seyhei();
    }
}
