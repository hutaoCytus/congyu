package Collection体系集合.Set接口使用.TreeSet;

import Collection体系集合.Set接口使用.HashSet.Person;

import java.util.Iterator;
import java.util.TreeSet;

/*
* 使用Tree保存数据
* 储存结构:红黑树
* 要求：元素必须要实现Comparable接口，compareTo()方法返回为0，认为是重复元素
* */
public class TreeSet2 {
    public static void main(String[] args) {
        //创建集合
        TreeSet<Person> person=new TreeSet();
        //1添加元素
      Person p1=new Person("刘德华",20);
      Person p2=new Person("林志玲",22);
      Person p3=new Person("梁朝伟",25);

        person.add(p1);
        person.add(p2);
        person.add(p3);
        System.out.println("元素个数"+person.size());
        System.out.println(person.toString());
        
        
        //2删除
//        person.remove(p1);
//        System.out.println(person.size());
        
        
        //3遍历
        //3.1增强for     
        for (Person per:person
             ) {
            System.out.println(person.toString());
        }
        //3.2迭代器
        Iterator<Person>it=person.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


        //4判断
        System.out.println(person.contains(p1));
        System.out.println(person.isEmpty());
    }
}
