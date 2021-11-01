package Collection体系集合.List接口使用.泛型.泛型集合;
import Collection体系集合.Collection接口.student;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        ArrayList<String>arrayList=new ArrayList<String>();
        arrayList.add("xxx");
        arrayList.add("yyy");
//        arrayList.add(20);
//        arrayList.add(15);
        for (String str:arrayList
             ) {
            System.out.println(str);
        }


      ArrayList<student>arrayList1=new ArrayList();//不是本类的，要进行导包
        student s1=new student("张三",20);
        student s2=new student("张无忌",23);
        student s3=new student("王二",22);
        arrayList1.add(s1);
        arrayList1.add(s2);
        arrayList1.add(s3);

        Iterator<student>it=arrayList1.iterator();
            while (it.hasNext()){
                student s=it.next();
                System.out.println(s);
            }

    }
}
