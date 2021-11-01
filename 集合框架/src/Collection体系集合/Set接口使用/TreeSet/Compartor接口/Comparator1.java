package Collection体系集合.Set接口使用.TreeSet.Compartor接口;

import Collection体系集合.Set接口使用.HashSet.Person;

import java.util.TreeSet;

import java.util.Comparator;
/*
* TreeSet集合的使用
* Comparator：实现定制比较(比较器)
* Comparable：可比较的
* */
public class Comparator1 {
    public static void main(String[] args) {
        TreeSet<Person> person=new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
            int n1=o1.getAge()- o2.getAge();
            int n2=o1.getName().compareTo(o2.getName());
                return n1==0?n1:n2;
            }
        });

        Person p1=new Person("刘德华",20);
        Person p2=new Person("林志玲",22);
        Person p3=new Person("梁朝伟",25);

        person.add(p1);
        person.add(p2);
        person.add(p3);
        System.out.println("元素个数"+person.size());
        System.out.println(person.toString());
    }
}
