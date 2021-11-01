package Map集合.TreeSMap;

import Map集合.HashMap使用.student;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {
    public static void main(String[] args) {
        //新建集合
        TreeMap<student,String>treeMap=new TreeMap<>();
        //1添加元素
        student s1=new student("孙猴子",100);
        student s2=new student("猪八戒",101);
        student s3=new student("沙悟净",102);
        treeMap.put(s1,"北京");
        treeMap.put(s2,"上海");
        treeMap.put(s3,"杭州");
        System.out.println("元素个数："+treeMap.size());
        System.out.println(treeMap.toString());


        //2删除
        treeMap.remove(s3);
        System.out.println("删除之后"+treeMap.size());


        //3遍历
        //3.1keySet
        System.out.println("-------keySet------");
        for (student key:treeMap.keySet()
             ) {
            System.out.println(key+"---"+treeMap.get(key));
        }
        //3.2entrySet
        System.out.println("-------entrySet------");
        for (Map.Entry<student,String> entry: treeMap.entrySet()
             ) {
            System.out.println(entry.getKey()+"--"+entry.getValue());
        }


        //4检查
        System.out.println(treeMap.containsKey(s1));
        System.out.println(treeMap.containsValue("上海"));
    }
}
