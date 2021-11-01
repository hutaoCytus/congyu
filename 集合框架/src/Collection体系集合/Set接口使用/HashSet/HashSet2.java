package Collection体系集合.Set接口使用.HashSet;

import java.util.HashSet;
import java.util.Iterator;

/*
* HashSet使用
* 储存结构：哈希表(数组＋链表+红黑树)
* 储存过程
* 1根据Hashcode计算保存的位置，如果此位置为空，则直接保存，如果不为空则执行第二步
* 2再执行equals方法，如果equals方法返回true，则认为是重复，不能添加，否则形成链表
* */
public class HashSet2 {
    public static void main(String[] args) {
        //创建集合
        HashSet<Person> person=new HashSet<>();
        //1添加对象
        Person p1=new Person("刘德华",20);
        Person p2=new Person("林志玲",22);
        Person p3=new Person("梁朝伟",25);
        person.add(p1);
        person.add(p2);
        person.add(p3);
        person.add(new Person("梁朝伟",25));//在Person文件里面重写的Hashcode和equals方法，所以不能存放
        System.out.println("元素个数："+person.size());
        System.out.println(person.toString());


        //3遍历
        //3.1使用增强for
        System.out.println("------增强for-----");
        for (Person per: person
             ) {
            System.out.println(person.toString());
        }
        //3.2迭代器
        System.out.println("------迭代器-----");
        Iterator it= person.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


        //4判断
        System.out.println("------判断-----");
        System.out.println(person.contains(p1));
        System.out.println(person.isEmpty());

    }
}
