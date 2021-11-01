package 封装.案例;
/*
   用户类
   @author wgy
 */
public class user {
    private String craNo;
    private String identity;
    private String username;
    private String password;
    private String phone;
    private double balance;
    public user(){

    }
    //带参构造方法
    public user(String craNo, String identity, String username, String password, String phone, double balance) {
        this.craNo = craNo;
        this.identity = identity;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.balance = balance;
    }
    //get和set

    public String getCraNo() {
        return craNo;
    }

    public void setCraNo(String craNo) {
        this.craNo = craNo;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}