package Collection体系集合.Set接口使用.TreeSet;
import java.util.Iterator;
import java.util.TreeSet;
public class TreeSet1 {
    public static void main(String[] args) {
        //创建集合
        TreeSet<String> treeSet=new java.util.TreeSet<>();
        //1添加元素
        treeSet.add("xyz");
        treeSet.add("abc");
        treeSet.add("hello");
        System.out.println("元素个数:"+treeSet.size());
        System.out.println(treeSet.toString());


        //2删除
//        treeSet.remove("xyz");
//        System.out.println("删除之后:"+treeSet.size());


        //3遍历
        //3.1增强for
        for (String str:treeSet
             ) {
            System.out.println(str);
        }
        System.out.println("-----迭代器-----");
        Iterator it=treeSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


        //4判断
        System.out.println(treeSet.contains("abc"));
        System.out.println(treeSet.isEmpty());
    }
}
