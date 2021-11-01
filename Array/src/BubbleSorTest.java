/*
数组的冒泡排序的实现
 */
public class BubbleSorTest {
    public static void main(String[] args) {

        int [] arr =new int []{43,32,55,-98,0,64,33,-21,32,99};


    //
          for(int i=0;i<arr.length-1;i++){//控制循环次数
              for (int j=0;j< arr.length-1-i;j++){//寻找并且判断，判断成功就进行换位
                  if (arr[j]>arr[j+1]){
                      int temp=arr[j];
                      arr[j]=arr[j+1];
                      arr[j+1]=temp;
                  }
              }

    }
          for (int i=0;i< arr.length;i++){
              System.out.print(arr[i]+" ");
          }
   }
}