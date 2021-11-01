

public class text0 {
    public static void main(String[] args) {
        System.out.println(jc(5));//计算5的阶乘
    }
    public  static  int jc(int n){
        int smu=1;
        for (int i=1;i<=n;i++){
            smu*=i;
        }
        return smu;
    }




//递归计算阶乘
//何为递归：1递“进”；每次推进，计算都比上一次变得简单，直至简单到无需继续推进，就能获得结果，也叫到达出口
//        2回”归“：基于出口的结果逐层向上回归，依次计算每一层的结果，直至回归带最顶层
//    public static void main(String[] args) {
//        int result=getfive(5);
//        System.out.println(result);
//    }
//    计算5的阶乘
//    public  static  int getfive(int n){//n=5
//        return n*getfour(n-1);
//    }
//    计算4的阶乘
//    public  static  int getfour(int n){//n=4
//        return n*getthree(n-1);
//    }
//    计算3的阶乘
//    public  static  int getthree(int n){//n=3
//        return n*gettwo(n-1);
//    }
//    计算2的阶乘
//    public  static  int gettwo(int n){//n=2
//        return n*getone(n-1);
//    }
//    计算1的阶乘
//    public  static  int getone(int n){//n=1
//        return 1;
//    }


    //整合为一个方法
//    public static void main(String[] args) {
//        System.out.println(fac(5));
//    }
//
//    public static int fac(int n) {
//        if (n==1){
//            return 1;
//        }
//        return n*fac(n-1);
//    }











}
//int float
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//}
