package 封装;

public class student {
    private String name;
    private int age;
    private String sex;
    private double score;
    //对非法数据进行拦截
    //封装姓名
    public void setName(String name) {
            this.name=name;
    }
    //封装年龄
    public void setAge(int age){
        if (age>0&&age<100){//对传入的数值进行判断
            this.age=age;//成功判断，进行赋值
        }else {
            this.age=18;//失败判断，输出结果
        }
    }
    //封装性别
    public void setSex(String sex){
        if (sex=="男"){
            this.sex=sex;
        }else if (sex=="女"){
            this.sex=sex;
        }else {
            System.out.println("无用");
        }
    }
    //封装成绩
    public void setScore(double score) {
        if (score>0.00&&score<100.00){
            this.score = score;
        }else {
            System.out.println("无用");
        }

    }
    //获取返回值
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public double getScore() {
        return score;
    }


    public void sayhei(){
    System.out.println("姓名："+this.name+"\n年龄："+this.age+"\n性别："+this.sex+"\n成绩："+this.score);
}
}
