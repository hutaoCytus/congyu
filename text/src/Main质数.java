public class Main质数 {

    public static void main(String[] args) {
        int num=0;
        boolean isflag = true;
        //100以内的质数
        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j <=Math.sqrt(i);j++) {
                if (i % j == 0) {
                    isflag = false;
                    break;
                }
            }
            if (isflag){
                //System.out.println(i);
                num++;

            }
            isflag=true;

        }
        System.out.println("总共"+num+"个质数");
    }
}
