package Collection体系集合.Set接口使用.HashSet;

import java.util.Objects;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
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
        return "Person [name="+name+",age="+age+"]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }

    @Override
    public int compareTo(Person o) {
        int n1=this.name.compareTo(o.name);
        int n2=this.age-o.getAge();
        return n1==0?n2:n1;
    }

    //    @Override
//    public int hashCode() {
//        int n1=this.name.hashCode();
//        int n2=this.age;
//        return n1+n2;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this==obj){
//            return true;
//        }
//        if (obj==null){
//            return false;
//        }
//        if (obj instanceof Person){
//            Person p=(Person)obj;
//            if (this.name.equals(p.getName())&&this.age==p.getAge()){
//                return true;
//            }
//        }
//
//        return super.equals(obj);
//    }
}
