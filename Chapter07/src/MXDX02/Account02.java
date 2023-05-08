package MXDX02;
//  P28
public class Account02 {
    private int id;
    public double balance;
    private double annualInterestRate;
    public Account02(int id,double balance,double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
//    public Account02(){
//
//    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public double getMonthlyInterest(){
        return annualInterestRate/12;
    }
    public void deposit(double amount){
        this.balance = balance + amount;
    }
    public void withdraw(double amount){
        if (balance < amount){
            System.out.println("余额不足!");
            System.out.println("您的账户余额为：" + balance);
        }else{
            this.balance = balance - amount;
        }
    }
}
