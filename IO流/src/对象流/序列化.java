package 对象流;

import java.io.Serializable;

public class 序列化 implements Serializable {
    private String name;
    private  int age;

    public 序列化() {
    }

    public 序列化(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "序列化{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
