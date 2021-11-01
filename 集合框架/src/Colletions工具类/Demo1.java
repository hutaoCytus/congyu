package Colletions工具类;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(20);
        list.add(2);
        list.add(5);
        list.add(40);
        list.add(8);
        //sort排序
        System.out.println("sort排序");
        System.out.println("排序之前"+list.toString());
        Collections.sort(list);
        System.out.println("排序之后"+list.toString());


        //binarySearch 二分查找
        System.out.println("二分查找");
        int n1=Collections.binarySearch(list,12);
        System.out.println("位置："+n1);


        //copy复制
        System.out.println("copy复制");
        List<Integer> list1=new ArrayList();
        for (int k=0;k<list.size();k++){
            list1.add(0);
        }
        Collections.copy(list1,list);
        System.out.println(list1);


        //reverse反转
        System.out.println("reverse反转");
        Collections.reverse(list);
        System.out.println("打乱之后"+list);


        //shuffle打乱
        System.out.println("shuffle打乱");
        System.out.println("打乱之后"+list);


        //补充：list转成数组
        System.out.println("list转成数组");
        Integer[]arr=list.toArray((new Integer[0]));
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));


        //补充：数组转集合
        System.out.println("数组转集合");
        String[]names={"张三","李四","王五","小六"};


        //转集合后，这个集合是一个受限集合，不能添加和删除
        List<String> list2=Arrays.asList(names);
        System.out.println(list2);


        //把基本类型数组转成集合时，需要改为包装类型
        Integer[]num={100,200,300,400,500};
        List<Integer> list3=Arrays.asList(num);
        System.out.println(list3);
    }
}
