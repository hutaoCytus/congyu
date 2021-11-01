import java.text.DecimalFormat;
import java.util.Scanner;

public class project1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//         int a= sc.nextInt();
//         int b= sc.nextInt();
//         int sum=0;
//         int count=0;
//         for (int i=a;i<=b;i++){
//             System.out.print("\t"+i+"\t");
//             sum+=i;
//             count++;
//             if (count==5){
//                 System.out.println("");
//             count=0;
//             }
//         }
//        System.out.println("\n"+"Sum = "+sum);
        //n!=1×2×3×……×n
//        DecimalFormat sd=new DecimalFormat("0.00000000000");
        float b= sc.nextFloat();
        float s=b*5;
        System.out.println(s);
        System.out.println(new DecimalFormat("0.000000000").format(s));
    }
}