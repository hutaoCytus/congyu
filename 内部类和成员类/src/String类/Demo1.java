package String类;

public class Demo1 {
    public static void main(String[] args) {
         String name="hello";//"hello"常量储存在字符串池中.
         name="zhangsan";//"zhangsan",赋值给name变量时，并没有修改数据，而是重新开辟一个空间来存放
         String name2="zhangsan";//

         //演示字符串的另一种创建方法,new String();
        String str=new String("java");
        String str2=new String("java");
        System.out.println(str==str2);//这样比的是地址，当new一个对象时，地址是不一样的所以是false
        System.out.println(str.equals(str2));//这样比的是内容，内容相等，所以是true
    }
}
