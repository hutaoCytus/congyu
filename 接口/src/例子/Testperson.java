package 例子;

public class Testperson {
    public static void main(String[] args) {
        person p=new person("小明",12);
        p.fiy();
        p.fire();
        System.out.println("=====多态====");
        fly f=new person("小李",13);
        f.fiy();
        fire fe=new person("小李",13);
        fe.fire();
        sleep sl=new person("小李",14);
        sl.sleep();
    }
}
