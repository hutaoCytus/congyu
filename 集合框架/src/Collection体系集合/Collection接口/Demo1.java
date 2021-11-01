package Collection体系集合.Collection接口;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 *Collection接口的使用
 * 1.添加元素
 * 2.删除元素
 * 3.遍历元素
 * 4.判断
 */
public class Demo1 {
    public static void main(String[] args) {
        //1.
        Collection collection=new ArrayList();
        collection.add("苹果");
        collection.add("西瓜");
        collection.add("榴莲");
        System.out.println("元素个数:"+collection.size());
        System.out.println(collection);

        //2.删除元素
        collection.remove("苹果");
        //collection.clear();
        System.out.println("删除后元素个数"+collection.size());
        System.out.println(collection);


        //3.遍历元素(重点)
        //3.1使用增强for
        System.out.println("-------3.1使用增强for------");
        for ( Object object: collection
             ) {
            System.out.println(collection);
        }
        //3.2使用迭代器(迭代器专门用来遍历集合)
        System.out.println("-------3.2使用迭代器------");
        //hasNext();有没有下个元素
        //next();获取下一个元素
        //remove();删除当前元素
        Iterator it= collection.iterator();
        while (it.hasNext()){
            String s=(String)it.next();
            System.out.println(s);
            //collection.remove(s);在迭代器里面不能使用collection的删除方法
            it.remove();
            System.out.println("元素个数"+collection.size());
        }
        //4 判断
        System.out.println(collection.contains("西瓜"));//判断集合里面有没有西瓜这个元素
        System.out.println(collection.isEmpty());//判断集合是否为空
    }
}
