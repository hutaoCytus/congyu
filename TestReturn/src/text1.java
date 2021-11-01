import java.util.Scanner;

public class text1 {
    public static void main(String[] args) {
        int result=add(5,10);//调用add，并创建一个对象接收add的返回值
        System.out.println(result);
        int sum=add(result,20);
        System.out.println(sum);
    }
    public static int add(int a,int b){
        int sum=a+b;
        return sum;
    }
}
