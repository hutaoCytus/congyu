package Collection体系集合.List接口使用.ArrayLIst;

import java.util.Enumeration;
import java.util.Vector;

public class Vector使用 {
    public static void main(String[] args) {
        //创建集合
        Vector vector=new Vector<>();
        //1添加元素
        vector.add("草莓");
        vector.add("西瓜");
        vector.add("芒果");
        System.out.println("元素个数"+vector.size());


        //2删除
//        vector.remove(0);
//        vector.remove("西瓜");
//        vector.clear();


        //3遍历
        //使用枚举器
        Enumeration en= vector.elements();
        while (en.hasMoreElements()){
            Object o=(String)en.nextElement();
            System.out.println(o);
        }


        //4判断
        System.out.println(vector.contains("西瓜"));
        System.out.println(vector.isEmpty());

        //5vector其他方法:lastElement,firstElement
    }
}
