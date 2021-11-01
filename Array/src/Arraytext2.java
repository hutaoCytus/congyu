public class Arraytext2 {
    public static void main(String[] args) {
//        String[] arr = new String[]{"jj", "dd", "mm", "bb", "gg", "aa"};
//
////        //数组的复制（区别于数组变量的赋值：arr1=arr）
//        String[] arr1 = new String[arr.length];
//        for (int i = 0; i < arr1.length; i++) {
//            arr1[i] = arr[i];
//            System.out.print(arr1[i]+" ");
//        }
//        System.out.println();
//        //数组的反转
//        for (int i=0,j= arr.length-1;i<j;i++,j--){
//            String temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//        }
//        for (int i=0;i< arr.length;i++){
//            System.out.println(arr[i]+"\t");
//        }
//        //数组的查找(搜索)
//        //线性查找：
//        String dest = "cc";
//        boolean isfalg = false;
//        for (int i = 0; i < arr.length; i++) {
//            if (dest.equals(arr[i])) {
//                System.out.println("找到了指定元素，位置为" + i);
//                isfalg = true;
//                break;
//            }
//            if (isfalg==false) {
//                System.out.println("没有这个元素");
//                break;
//            }
            //二分法查找：
            //前提：所要查找的数组必须有序
            int []arr2=new int[]{-98,-34,2,34,54,66,79,105,201,333};
            int dest1=79;
            int head=0;//初始的索引
            int end= arr2.length-1;//初始的末索引,(10个元素)
            boolean isflag1=true;
            while (head<=end){
                int middle=(head+end)/2;//middle=(0+9)/2=4.5,向左取，所以middle=4;
                if (dest1==arr2[middle]){
                    System.out.println("找到了指定元素：位置为"+middle);
                    isflag1=false;
                    break;
                }else if (arr2[middle]>dest1){//arr2[4]=54 54>79不成立,跳到下一个条件
                    end=middle-1;
                }else {//arr2[middle]<dest1 54<79,成立,继续执行
                   head=middle+1;//head=0 middle=4 结果middle为5;回到循环
                }
            }
            if (isflag1){
                System.out.println("没有这个元素");
            }
        }
    }
