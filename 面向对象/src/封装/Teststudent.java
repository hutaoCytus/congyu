package 封装;

public class Teststudent {
    public static void main(String[] args) {
        student s1=new student();
        s1.setName("小王");
        s1.setAge(65);//使用方法赋值
        s1.setSex("女");
        s1.setScore(90);
        s1.sayhei();
        System.out.println("------------------------");
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getSex());
        System.out.println(s1.getScore());
    }

}
