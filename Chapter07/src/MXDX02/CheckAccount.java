package MXDX02;

public class CheckAccount extends Account02{
    private double overdraft;
    public CheckAccount(int id,double balance,double annualInterestRate){
        super(id, balance, annualInterestRate);
    }

    @Override
    public void withdraw(double amount) {
        if (amount < balance){
            balance = balance - amount;
        }else if (amount > balance){
            System.out.println("您需要透支的额度为：" + (amount - balance));
        }
    }
}
