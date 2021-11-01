package Collection体系集合.List接口使用.泛型;
/*
 *泛型类
 * 语法：类名<T>如果编写多个，使用逗号隔开
 */
public class MyGeneric<T> {
       //使用泛型T
       //1创建变量
      T t;

      //2作为方法的参数
    public void show(T t){
        System.out.println(t);
    }
    //3泛型作为方法的返回值
    public T getT(){
        return t;
    }


}
