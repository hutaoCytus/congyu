package Collection体系集合.Set接口使用;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 *测试Set接口的使用
 * 特点：1.无序，没有下标 2.不能重复
 * */
public class Demo {
    public static void main(String[] args) {
        //创建集合
        Set<String>set=new HashSet<>();
        //1添加数据
        set.add("苹果");
        set.add("华为");
        set.add("小米");
        System.out.println("数据个数"+set.size());
        System.out.println(set.toString());


        //2删除
        set.remove("小米");
        System.out.println(set.toString());


        //3遍历
        //3.1增强for
        for (String str:set
             ) {
            System.out.println(str);
        }
        //3.2迭代器
        Iterator<String>it=set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


        //4判断
        System.out.println(set.contains("小米"));
        System.out.println(set.isEmpty());
    }
}
