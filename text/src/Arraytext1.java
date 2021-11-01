import java.util.*;

import java.text.DecimalFormat;
//数组的引用
public class Arraytext1 {
    public static void main(String[] args) {
               int s[]=new int[10];
               for (int i=0;i< s.length;i++){
                   s[i]=(int)(Math.random()*100);//随机数
                   System.out.print(s[i]+" "+"\n");
               }
        //最大值
               int max=s[0];
               for (int i=0;i< s.length;i++) {
                   if (max < s[i]) {
                       max = s[i];
                   }
               }
               System.out.println("最大值为"+max);
        //最小值
               int min=s[0];
               for ( int j=1;j<s.length;j++) {
                    if (min>s[j]) {
                        min=s[j];
                    }
               }
        System.out.println("最小值为"+min);
        int sum=0;
        for (int i=0;i< s.length;i++) {
            sum=sum+s[i];
        }
        System.out.println("总和为"+sum);
        int pjs=0;
        for (int i=0;i< s.length;i++) {
            pjs=(sum+s[i])/s.length;
        }
        System.out.println("平均数为"+pjs);
    }
    }
