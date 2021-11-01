package Collection体系集合.Set接口使用.TreeSet.TreeSet案例;

import java.util.Comparator;
import java.util.TreeSet;

/*
* 要求：使用TreeSet集合实现字符串按照长度进行排序
* hello world  zhang   lisi  wangwu  beijing  xian  nanjing
* */
public class Demo {
    public static void main(String[] args) {
        //创建集合，并定制比较规则
        TreeSet<String>set=new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int n1=o1.length()-o2.length();
                int n2=o1.compareTo(o2);
                return n1==0?n2:n1;
            }
        });
        set.add("hello world");
        set.add("zhang");
        set.add("lisi");
        set.add("wangwu");
        set.add("beijing");
        set.add("xian");
        set.add("nanjing");
        System.out.println(set.toString());
    }
}
