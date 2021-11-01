package Collection体系集合.Set接口使用.HashSet;

import java.util.HashSet;
import java.util.Iterator;

/*
* HashSet集合使用
* 储存结构哈希表(数组+链表+红黑树)
* */
public class HasSet {
    public static void main(String[] args) {
        //新建集合
        //1添加元素
        HashSet<String>set=new HashSet();
        set.add("刘德华");
        set.add("梁朝伟");
        set.add("林志玲");
        set.add("周润发");
        System.out.println("元素个数："+set.size());
        System.out.println(set.toString());


        //2删除元素
//        set.remove("刘德华");
//        System.out.println(set.size());


        //3遍历
        //3.1增强for
        System.out.println("------3.1增强for----");
        for (String str:set
             ) {
            System.out.println(str);
        }
        //3.2迭代器
        System.out.println("------3.2迭代器----");
        Iterator<String> it= set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


        //4判断
        System.out.println(set.contains("刘德华"));
        System.out.println(set.isEmpty());
    }
}
