package Collection体系集合.List接口使用.List子接口;

import java.util.ArrayList;
import java.util.List;

/*
 *List的使用
 */
public class Demo2 {
    public static void main(String[] args) {
        //创建集合
        List list=new ArrayList();
        //1.添加数字数据(自动装箱)
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println("元素个数:"+list.size());
        System.out.println(list.toString());


        //2删除操作
//        list.remove(20); remove里面的数字是下标，表示删除下标为20的元素，但我创建的元素只有5个，所以会失败
//        list.remove((Object)20);可以转Object
        list.remove(new Integer(20));//也可以转Integer
        System.out.println("删除元素后个数:"+list.size());
        System.out.println(list.toString());

        //3补充方法subList：返回子集合，含头不含尾
        List sublist=list.subList(1,3);
        System.out.println(sublist.toString());
    }
}
