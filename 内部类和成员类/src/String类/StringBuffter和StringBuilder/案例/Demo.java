package String类.StringBuffter和StringBuilder.案例;

public class Demo {
    public static void main(String[] args) {
        long star=System.currentTimeMillis();
//        String str="";
//        for (int i = 0; i <9999 ; i++) {
//            str+=i;
//        }
//        System.out.println(str);
        StringBuffer sb=new StringBuffer();
        for (int i = 0; i <9999 ; i++) {
            sb.append(i);
        }
        System.out.println(sb.toString());
        long end=System.currentTimeMillis();
        System.out.println("用时"+(end-star));//运行速度
    }
}
