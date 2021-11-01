package Collection体系集合.Collection接口;
/*
 *Collection使用：保存学生信息
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo2 {
    public static void main(String[] args) {
        //新建Collection对象
        Collection collection=new ArrayList();
        student s1=new student("张三",20);
        student s2=new student("张无忌",23);
        student s3=new student("王二",22);
        //1添加学生数据
        collection.add(s1);
        collection.add(s2);
        collection.add(s3);
        System.out.println("元素个数"+collection.size());
        System.out.println(collection.toString());

        //2删除学生数据
//        collection.remove(s1);
//        collection.clear();
//        System.out.println("删除之后："+collection.size());

        //3遍历
        //3.1增强for
        System.out.println("------3.1增强for------");
        for (Object o:collection
             ) {
            student s=(student)o;
            System.out.println(s.toString());
        }
        //3.2使用迭代器
        System.out.println("------3.2使用迭代器------");
        Iterator it=collection.iterator();
        while (it.hasNext()){
            student s=(student)it.next();
            System.out.println(s.toString());
        }
        //4判断
        System.out.println(collection.contains(s1));
        System.out.println(collection.isEmpty());
    }
}
