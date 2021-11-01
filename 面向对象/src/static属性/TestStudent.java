package static属性;

public class TestStudent {
    public static void main(String[] args) {
    students s=new students();
        s.name="aaa";
        s.age=12;
        s.show();

    students s1=new students();
       s1.name="bbb";
       s1.age=22;
       s1.show();

       //------------调用静态 类名。静态属性名-----------
        students.count=50;
        System.out.println("学生数量"+students.count);
        //------------调用静态方法 类名。静态属性名-----------
           students.method1();
           students.method2();
    }
}
