package calendar;

import java.util.Calendar;

public class Deno {
    public static void main(String[] args) {
        //1创建Calender对象
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar.getTime().toLocaleString());
        System.out.println(calendar.getTimeInMillis());
        //2获取时间信息
        //获取年
        int year=calendar.get(calendar.YEAR);
        //获取月
        int month= calendar.get(calendar.WEEK_OF_MONTH);
        //获取日
        int day=calendar.get(calendar.DAY_OF_MONTH);
        //小时 HOUR 12小时制 HOUR_OF_DAY 24小时制
        int hour=calendar.get(calendar.HOUR_OF_DAY);
        //分
        int minute=calendar.get(calendar.MINUTE);
        //秒
        int second=calendar.get(calendar.SECOND);
        System.out.println(year+"年"+month+"月"+day+"日"+hour+":"+minute+":"+second);

        //3修改时间
        Calendar calendar2=calendar.getInstance();
        calendar2.set(calendar.DAY_OF_MONTH,5);
        System.out.println(calendar2.getTime().toLocaleString());

        //4add修改时间
        calendar2.add(Calendar.HOUR,-1);
        System.out.println(calendar2.getTime().toLocaleString());

        //5补充方法
        calendar2.add(Calendar.MONTH,-2);
        int max=calendar2.getActualMaximum(Calendar.DAY_OF_MONTH);//获取当前月份的最大值（可以理解当前月份有多少天）
        int min=calendar2.getActualMinimum(Calendar.DAY_OF_MONTH);//获取当前月份的最小值
        System.out.println(max);
        System.out.println(min);
    }
}
