package System类;

public class Demo1 {
    public static void main(String[] args) {
        //System.arraycopy:数组的复制 ,格式:System.arraycopy(src,srcPos,dest,destPos,length);
        /*    src:原数组
         * srcPos:从那个位置开始复制
         *   dest:目标数组
         *destPos:目标数组的位置
         * length:复制的长度
         */

        //原数组
        int []arr={1,5,6,8,2,36,96,69};
        //目标数组
        int []dest=new int[8];
        System.arraycopy(arr,0,dest,0,arr.length);//length和srcPos相加不能比原数组的length大
        for (int i=0;i< dest.length;i++){
            System.out.println(dest[i]);
        }

        //System.currentTomeMillis():该方法的作用是返回当前的计算机时间，时间的表达格式为当前计算机时间和GMT时间(格林威治时间)1970年1月1号0时0分0秒所差的毫秒数
        long start=System.currentTimeMillis();
        for (int i = -9999999; i <9999999 ; i++) {
            for (int j = -9999999; j < -9999999; j++) {
                int result=i+j;
            }
        }
        long end=System.currentTimeMillis();
        System.out.println("用时:"+(end-start));


        //4退出jvm
        System.exit(0);
        System.out.println("程序结束了。。");//这句语句不会被执行，因为jvm退出了
    }
}
