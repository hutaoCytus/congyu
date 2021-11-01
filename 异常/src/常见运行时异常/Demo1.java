package 常见运行时异常;
/*
* 演示常见时异常
* 运行时异常：RuntimeException以及子类
* 检查时异常：Exception以及子类，除了RuntimeException
* */
public class Demo1 {
    public static void main(String[] args) {
        //常见运行时异常
        //1NullPointer Exception
//        String name=null;
//        System.out.println(name.equals("zhangsan"));


        //2ArrayIndexOutBoundsException
//        int []arr={10,20,50};
//        System.out.println(arr[3]);


        //3ClassCastException
//        Object str="hello";
//        Integer i=(Integer)str;
//        System.out.println(i);


        //4NumberFormatException
//        int n=Integer.parseInt("100a");
//        System.out.println(n);


        //5ArithmeticException
//        int n=10/0;
//        System.out.println(n);
    }
}
