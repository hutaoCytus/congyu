package 抛出异常;

import java.util.Scanner;

public class TestPerson {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Person xiaozhang=new Person();
        xiaozhang.setName("小张");
        xiaozhang.setSex("男");
        xiaozhang.setAge(100);
        System.out.println(xiaozhang.toString());
    }
}
