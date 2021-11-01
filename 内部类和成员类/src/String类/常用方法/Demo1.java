package String类.常用方法;
import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        //字符串方法的使用
        //1.length();返回字符串的长度
        //2.charAt(int index);返回某个位置的字符
        //3.

        String content="java是世界上最好的java编程语音 java真香";
        System.out.println(content.length());
        System.out.println(content.charAt(content.length()-1));
        System.out.println(content.contains("java"));//有java这个子字符串，是true
        System.out.println(content.contains("php"));//无php这个子字符串，是false

        System.out.println("------------------分隔符------------------");
        //4.toCharArray();返回字符串对应的数组
        //5.indexOf();返回子字符串首次出现的位置
        //6.lastIndexOf();返回字符串最后一次出现的位置
        System.out.println(content.toCharArray());
        System.out.println(Arrays.toString(content.toCharArray()));//用数组的方式输出
        System.out.println(content.indexOf("java"));
        System.out.println(content.indexOf("java",4));//从下标4的位置开始找
        System.out.println(content.lastIndexOf("java"));

        System.out.println("------------------分隔符------------------");
        //7.trim();去掉字符串前后的空格
        //8.toUpperCase();把小写转成大写   toLowerCase();把大写转成小写
        //9.endWith(str);判断是否用str结尾  starWith(str);判断是否用str开头

        String content2="   hello World   ";
        System.out.println(content2.trim());
        System.out.println(content2.toUpperCase());//大写
        System.out.println(content2.toLowerCase());//小写
        String filename="hello.java";
        System.out.println(filename.endsWith(".java"));
        System.out.println(filename.startsWith("hello"));

        System.out.println("------------------分隔符------------------");
        //10. replace(char old,char new);用新的字符或者字符串替换旧的字符或字符串
        //11.split;对字符串进行拆分
        //12.equals;比较字符串的内容

        System.out.println(content.replace("java","php"));

        String say="java is the best programing language";
        String[] arr=say.split(" ");//以空格来判断，读取到空格就拆分一次
        String[] arr1=say.split("[ ,]+");//在中括号里面的字符来判断，读到中括号里面的字符就拆分一次，＋代表可以出现复数个
        System.out.println(arr.length);
        for (String string:arr) {
            System.out.println(string);
        }

        String s1="hello";
        String s2="HELLO";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));//忽略大小写的比较

    }
}
