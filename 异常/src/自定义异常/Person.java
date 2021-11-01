package 自定义异常;

public class Person {
          private String name;
          private String sex;
          private int age;

    public Person() {
    }

    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (sex.equals("男")||sex.equals("女")) {
            this.sex = sex;
        }else {
            throw new SexException("性别只能是男或女");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>0&&age<120){
            this.age = age;
        }else {
            //抛出异常
            throw new AgeException("年龄不符合要求");
        }
    }

    @Override
    public String toString() {
        return "Person " +
                "名字='" + name + '\'' +
                ", 性别='" + sex + '\'' +
                ", 年龄=" + age +
                ' ';
    }
}
