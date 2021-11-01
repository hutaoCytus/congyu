package 封装.案例;

import java.util.Scanner;

/*
银行类
@author wgy
 */
public class bank {
    //初始化用户
    private user[] users = new user[5];//定义保存用户的数组
    private int size;

    //初始化方法
    public void initial() {
        //创建用户 1
        user user1 = new user(
                "60028631824",
                "1901050224",
                "胡桃",
                "123456",
                "110",
                1000);
        //创建用户 2
        user user2 = new user(
                "60028631825",
                "1901050225",
                "钟离",
                "666666",
                "12310",
                1000);
        //创建用户3
        user user3 = new user(
                "60028631826",
                "1901050226",
                "行秋",
                "777777",
                "191687",
                100096);
        //创建用户4
        user user4 = new user(
                "60028631827",
                "1901050228",
                "北斗",
                "7777893",
                "191586",
                1000960);
        //创建用户5
        user user5 = new user(
                "60028631828",
                "1901050228",
                "锅巴",
                "777",
                "687",
                100);
        users[0] = user1;
        users[1] = user2;
        users[2] = user3;
        users[3] = user4;
        users[4] = user5;
        size = 5;
//          System.out.println("用户初始化完成");
    }

    public bank() {
        initial();
    }

    //2.用户登录
    public void login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入卡号");
        String cardNo = sc.next();//创建变量储存键盘输入的卡号
        System.out.println("请输入密码");
        String password = sc.next();//创建变量储存键盘输入的密码
        user u = null;
        for (int i = 0; i < size; i++) {
            if (users[i].getCraNo().equals(cardNo) && users[i].getPassword().equals(password)) {//寻找是否符合条件的用户
                u = users[i];//找到就把用户的值赋到u上面
                break;
            }
        }
        if (u != null) {
            //成功
            //显示菜单
            System.out.println("登录成功");
            showMenu(u);
        } else {
            System.out.println("卡号或密码错误");
        }


    }

    //3.显示菜单
    public void showMenu(user u) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====================欢迎进入银行系统=====当前用户:" + u.getUsername() + "============");
        do {
            System.out.println("=====1.存款 2.取款 3转账 4.查询余额 5.修改密码 0.退出=====");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    this.save(u);
                    break;
                case 2:
                    this.withdraw(u);
                    break;
                case 3:
                    this.trans(u);
                    break;
                case 4:
                    query(u);
                    break;
                case 5:
                    Cpassword(u);
                    break;
                case 0:
                    return;
                default:
                    break;
            }
        } while (true);
    }

    //4.存钱
    public void save(user u) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入存款金额");
        double m = sc.nextDouble();
        if (m > 0) {
            u.setBalance(u.getBalance() + m);
            System.out.println("存款成功，余额：" + u.getBalance());
        }
    }

    //5.取钱
    public void withdraw(user u) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入取款金额");
        double m = sc.nextDouble();
        if (m > 0) {
            if (m <= u.getBalance()) {
                u.setBalance(u.getBalance() - m);
                System.out.println("取款成功，余额：" + u.getBalance());
            } else {
                System.out.println("取款失败,余额不足");
            }
        } else {
            System.out.println("取款失败，请重新输入");
        }
    }

    //6.转账
    public void trans(user u) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入对方卡号");
        String cardNo = sc.next();
        System.out.println("请输入转账金额");
        double m = sc.nextDouble();
        //判断对方卡号是否存在
        user touser = null;
        for (int i = 0; i <= size; i++) {
            if (users[i].getCraNo().equals(cardNo)) {
                touser = users[i];
                break;
            }
        }
        //判断
        if (touser != null) {
            if (u.getBalance() > m) {
                //扣钱
                u.setBalance(u.getBalance() - m);
                //加钱
                touser.setBalance(touser.getBalance() + m);
                System.out.println("转账成功");
            } else {
                System.out.println("转账失败");
            }
        } else {
            System.out.println("对方卡号不存在，请重新输入");
        }
    }

    //7.查询余额
    public void query(user u) {
        System.out.println("请输入查询用户的卡号");
        Scanner sc = new Scanner(System.in);
        String cardNo = sc.next();
        user cuser = null;
        for (int i = 0; i <= size; i++) {
            if (users[i].getCraNo().equals(cardNo)) {
                cuser = users[i];
                break;
            }
        }
        if (cuser != null) {
            System.out.println("用户:" + cuser.getUsername());
            System.out.println("余额:" + cuser.getBalance());
        } else {
            System.out.println("对方卡号不存在，请重新输入");
        }
    }

    //8.修改密码
    public void Cpassword(user u) {
        System.out.println("请输入要修改密码的用户卡号");
        Scanner sc = new Scanner(System.in);
        String cardNo = sc.next();
        user touser = null;
        for (int i = 0; i <= size; i++) {
            if (users[i].getCraNo().equals(cardNo)) {
                touser = users[i];
                break;
            }
        }
        if (touser != null) {
            System.out.println("请输入新密码");
            String pa= sc.next();
            touser.setPassword(pa);
            System.out.println("现在密码为"+touser.getPassword());
        }else {
            System.out.println("修改失败");
        }
    }
}
