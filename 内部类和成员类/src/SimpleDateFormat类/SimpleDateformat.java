package SimpleDateFormat类;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateformat {
    public static void main(String[] args)throws Exception{
        //1.创建SimpDateFor对象 y：年，M：月
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
        //2.创建Date
        Date date1=new Date();
        //格式化date(把日期转成字符串)
        String str=sdf.format(date1);
        System.out.println(str);
        //解析(把字符串转成日期)

        Date date2=sdf.parse("1990/05/01");//注意，parse里面的格式要跟创建对象时的格式一样，要不然会有异常
        System.out.println(date2);
    }
}
