package String类.常用方法.案例演示;

public class Demo1 {
    /*需求：已知String str="this is a text";
    1.将str中的单词单独获取出来
    2.将str中的text替换为practice
    3.在text前面插入一个easy
    4.将每个单词首字母改为大写
     */
    public static void main(String[] args) {
        String str="this ia a text";
        //1.将str中的单词单独获取出来
        String []arr =str.split(" ");
        for (String s: arr) {
            System.out.println(s);
        }
        //2.将str中的text替换为practice
        System.out.println(str.replace("text","practice"));
        //3.在text前面插入一个easy
        System.out.println(str.replace("text","easy text"));
        //4.将每个单词首字母改为大写
        for (int i = 0; i < arr.length ; i++) {
            char fist=arr[i].charAt(0);
            //把第一个字符转大写
            char upperfirst=Character.toUpperCase(fist);
            //链接起来组成新的字符串
            String news=upperfirst+arr[i].substring(1);
            System.out.println(news);
        }
    }


}
