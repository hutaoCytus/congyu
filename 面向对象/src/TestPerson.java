public class TestPerson {
    public static void main(String[] args) {
        Person p=new Person();
        Person p1=new Person();//只会执行一次,就算创建多个对象也只会执行一次
    }
}
