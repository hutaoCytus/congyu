package 继承;

public class Animal {
    //品种
     public String breed;
    //年龄
    public int age;
    //性别
    public String sex;



    //吃
    public void eat(){
        System.out.println("吃屁");
    }
    //喝
    public void drink(){
        System.out.println("喝");
    }
    public void jie(){
        System.out.println("\n品种:"+breed+"\n年龄:"+age+"\n性别:"+sex);
    }
}
