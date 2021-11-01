package Collection体系集合.List接口使用.List子接口;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 *List子接口的使用
 * 特点：1有序，有下标 2可重复
 */
public class Demo1 {
    public static void main(String[] args) {
        //创建对象
        List list=new ArrayList<>();
        //1添加对象
        list.add("苹果");
        list.add("小米");
        list.add(0,"华为");
        System.out.println("元素个数"+list.size());
        System.out.println(list.toString());


        //2删除元素
//        list.remove("苹果");删除为苹果的元素
//        list.remove(0);删除下标为0的元素
//        System.out.println("删除后元素个数"+list.size());
//        System.out.println(list.toString());


        //3遍历元素
        //3.1使用for遍历
        System.out.println("-------3.1使用for遍历-------");
        for (int i = 0; i <list.size(); i++) {
            System.out.println(list.get(i));
        }
        //3.2使用增强for遍历
        System.out.println("-------3.2使用增强for遍历-------");
        for (Object object:list
             ) {
            System.out.println(object);
        }
        //3.3使用迭代器遍历
        System.out.println("-------3.3使用迭代器遍历-------");
        Iterator it =list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        //3.4使用列表迭代器  和Iterator的区别，LIstIterator可以向前或向后遍历，添加，删除，修改元素
        System.out.println("-------3.4使用列表迭代器从前往后遍历-------");
        ListIterator lit= list.listIterator();
        while (lit.hasNext()){
            System.out.println(lit.nextIndex()+":"+lit.next());
        }
        System.out.println("-------3.4使用列表迭代器从后往前遍历-------");
        while (lit.hasPrevious()){
            System.out.println(lit.previousIndex()+":"+lit.previous());
        }


        //4.判断
        System.out.println(list.contains("苹果"));
        System.out.println(list.isEmpty());


        //5.获取位置
        System.out.println(list.indexOf("华为"));
    }
}
