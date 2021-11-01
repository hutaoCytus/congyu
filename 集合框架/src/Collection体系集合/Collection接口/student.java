package Collection体系集合.Collection接口;

public class student {
    private  String name;
    private  int age;

    public student() {
    }

    public student(String name, int age) {
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
        return "student{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    @Override
    public boolean equals(Object obj) {
        //1判断是否为同一个对象
        if (this==obj){
            return true;
        }
        //2判断是否为空
        if (obj==null){
            return false;
        }
        //3判断是否为student类型
        if (obj instanceof student){
            student s=(student)obj;
            //4比较属性
            if (this.name.equals(s.getName())&&this.age==s.getAge()){
                return true;
            }
        }
        //5不满足条件返回
        return false;
    }
}
