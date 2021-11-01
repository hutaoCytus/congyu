package Map集合.HashMap使用;

import Map集合.HashMap使用.student;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;

/*
* HashMap集合的使用
* 储存结构：哈希表(数组+链表+红黑树)
* */
public class HashMap1 {
    public static void main(String[] args) {
        //创建集合
        HashMap<student,String> student=new HashMap<student,String>();


        //1添加元素
        student s1=new student("孙猴子",100);
        student s2=new student("猪八戒",101);
        student s3=new student("沙悟净",102);
        student.put(s1,"北京");
        student.put(s2,"上海");
        student.put(s3,"杭州");
//        student.put(new student("沙悟净",102),"南京");//重写了hashcode和equals方法
        System.out.println("元素个数："+student.size());
        System.out.println(student.toString());


        //2删除
        student.remove(s1);
        System.out.println("删除之后"+student.size());


        //3遍历
        //3.1使用keySet()
        System.out.println("-----使用keySet()-----");
        for (student key:student.keySet()
             ) {
            System.out.println(key.toString()+"======"+ student.get(key));
        }
        //3.2entryKey()
        System.out.println("-----使用entryKey()-----");
        for (Map.Entry<student,String> str:student.entrySet()
             ) {
            System.out.println(str.getKey()+"---"+str.getValue());
        }


       //4检查
        System.out.println(student.containsKey(new student("沙悟净",102)));
        System.out.println(student.containsValue("北京"));
    }
}
