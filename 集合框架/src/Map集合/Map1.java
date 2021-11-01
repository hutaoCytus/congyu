package Map集合;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
* Mao接口的使用
* 特点：(1)储存键值对(2)键不能重复，值可以重复(3)无序
* */
public class Map1 {
    public static void main(String[] args) {
       //创建Map集合
        Map<String,String>map=new HashMap<>();
        //1添加元素
        map.put("cn","中国");
        map.put("uk","英国");
        map.put("usa","美国");
        System.out.println(map.size());
        System.out.println(map.toString());


        //2删除
        System.out.println(map.remove("usa"));
        System.out.println("删除后："+map.size());


        //3遍历
        //3.1使用keySet();
        System.out.println("-------使用keySet()-------");
//        Set<String> keyset=map.keySet();//可以写在增强for里面
        for (String str:map.keySet()
             ) {
            System.out.println(str+"---"+ map.get(str));
        }
        //3.2使用entrySet()方法
        System.out.println("-------使用entrySet()方法-------");
//        Set<Map.Entry<String,String>>key=map.entrySet();//可以写在增强for里面
        for (Map.Entry<String,String> str:map.entrySet()
             ) {
            System.out.println(str.getKey()+"---"+str.getValue());
        }


        //4判断
        System.out.println(map.containsKey("cn"));
        System.out.println(map.containsValue("usa"));
    }
}
