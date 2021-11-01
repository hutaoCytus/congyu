package Object类.toString方法;

public class Teststudent {
    public static void main(String[] args) {
        student s1=new student("aaa",20);
        student s2=new student("bbb",22);
        //判断s1和s2是否为同一个类型
        Class class1=s1.getClass();
        Class class2=s2.getClass();
        if (class1==class2){
            System.out.println("s1和s2为同一个类型");
        }else {
            System.out.println("不是同一个类型");
        }

        //2.hashcode方法
        System.out.println(s1.hashCode());
        System.out.println(s1.hashCode());
        student s3=s1;
        System.out.println(s3.hashCode());

        //3.toString
        System.out.println("------3.toStrong------");
        System.out.println(s1.toString());
        System.out.println(s2.toString());

        //s1.toString()
    }
}
