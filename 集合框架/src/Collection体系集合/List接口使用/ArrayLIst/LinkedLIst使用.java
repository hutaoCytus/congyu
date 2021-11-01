package Collection体系集合.List接口使用.ArrayLIst;

import Collection体系集合.Collection接口.student;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/*
 *LinkedList的使用
 * 储存结构：双向链表
 */
public class LinkedLIst使用 {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList<>();
        //1添加元素
        student s1=new student("刘德华",23);
        student s2=new student("周星驰",23);
        student s3=new student("帝君",3000);
        linkedList.add(s1);
        linkedList.add(s2);
        linkedList.add(s3);
        System.out.println("元素个数："+linkedList.size());
        System.out.println(linkedList.toString());

        //2删除
//        linkedList.remove(s1);
//        linkedList.clear();

        //3遍历
        System.out.println("---------for-------");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
        System.out.println("---------增强for-------");
        for (Object ob: linkedList) {
            student s=(student)ob;
            System.out.println(s.toString());
        }
        System.out.println("---------迭代器-------");
        Iterator it=linkedList.iterator();
        while (it.hasNext()){
            student s=(student) it.next();
            System.out.println(s.toString());
        }
        System.out.println("---------列表迭代器-------");
        ListIterator lit=linkedList.listIterator();
        while (lit.hasNext()){
            student s=(student) lit.next();
            System.out.println(s.toString());
        }
        //4判断
        System.out.println(linkedList.contains(s1));
        System.out.println(linkedList.isEmpty());
        //5获取
        System.out.println(linkedList.indexOf(s1));
    }
}
