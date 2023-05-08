package MXDX02;
/*
按照如下的UML类图，创建相应的类，提供必要的结构：
 */
public class Account {
    private double balance;
    public Account(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double money){
        this.balance = this.balance +money;
        System.out.println("存完钱后您的余额剩余：" + balance + "钱");
    }
    public void withdraw(double money){
        if (balance > money) {
            this.balance = this.balance - money;
            System.out.println("取完钱后您的余额剩余：" + balance + "钱");
        }
        else {
            System.out.println("抱歉您的余额不足");
        }
    }
}
