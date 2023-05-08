package MianXiangDuiXiang;
/*
1、写一个名为Account的类模拟账户。该类的属性和方法如下图所示。
该类包括的属性：账号id，余额balance，年利率annualInterestRate；
包含的方法：访问器方法（getter和setter方法），取款方法withdraw()，存款方法deposit()。
 */
public class Account {
    //声明属性
    private int id;
    private double balance;
    private double annualInterestRate;
    //构造器初始化赋值
    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
    //设置属性的值
    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    //访问属性的值
    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    //存款方法
    public void  withdraw(double quKuan){
    if (balance >= quKuan){
        System.out.println("请输入您要取的金额：");
    }else{
        System.out.println("抱歉您的余额不足");
    }
    }
    //取款方法
    public void  deposit(){

    }
}
