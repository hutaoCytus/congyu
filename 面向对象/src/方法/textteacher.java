package 方法;

public class textteacher {
    public static void main(String[] args) {
        //创建老师对象
        teacher wang=new teacher();
        wang.name="王老师";
        wang.age=24;
        wang.salary=2300;
        //
        //创建学生对象
        student xiaoming=new student();
        //属性赋值
        xiaoming.name="小明";
        xiaoming.age=15;
        xiaoming.sex="男";
        xiaoming.score=99;
    wang.seyhi();
    wang.know(xiaoming);
    }

}
