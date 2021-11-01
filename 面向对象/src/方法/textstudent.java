package 方法;

public class textstudent {
    public static void main(String[] args) {
                  //创建对象
                    student xiaoming=new student();
                  //属性赋值
                    xiaoming.name="小明";
                    xiaoming.age=15;
                    xiaoming.sex="男";
                    xiaoming.score=99;
                  //调用方法
                    xiaoming.seyhei();

//---------------------------------------
                  student xiaoli=new student();
                  xiaoli.name="小丽";
                  xiaoli.age=16;
                  xiaoli.sex="女";
                  xiaoli.score=89;
                  xiaoli.seyhei();

    }
}
