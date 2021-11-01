package Collection体系集合.List接口使用.ArrayLIst;

import Collection体系集合.Collection接口.student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*
 *ArrayList
 * 储存结构：数组，查找遍历速度块，增删慢
 */
public class ArrayLIst使用 {
    public static void main(String[] args) {
        //创建集合
        ArrayList arrayList=new ArrayList<>();
        //1添加元素
        student s1=new student("刘德华",23);
        student s2=new student("周星驰",23);
        student s3=new student("帝君",3000);

        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        System.out.println("元素个数"+arrayList.size());
        System.out.println(arrayList.toString());
        //2删除元素
        arrayList.remove(new student("刘德华",23));
        System.out.println("删除后元素个数"+arrayList.size());


        //3遍历元素(重点)
        //3.1增强for循环
        System.out.println("------增强for循环-----");
        for (Object object:arrayList
             ) {
            System.out.println(object.toString());
        }
        //3.2迭代器
        System.out.println("------迭代器-----");
        Iterator iterator=arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //3.3列表迭代器
        System.out.println("------列表迭代器-----");
        ListIterator lit =arrayList.listIterator();
        while (lit.hasNext()){
            student s=(student)lit.next();
            System.out.println(s.toString());
        }
        System.out.println("------列表迭代器逆序-----");
        while (lit.hasPrevious()){
            student s=(student)lit.previous();
            System.out.println(s.toString());
        }
        //4判断
        System.out.println(arrayList.contains(s1));
        System.out.println(arrayList.isEmpty());


        //5查找
        System.out.println(arrayList.indexOf(s2));
    }
}
