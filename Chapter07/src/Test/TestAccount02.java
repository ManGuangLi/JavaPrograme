package Test;

import MXDX02.Account02;

public class TestAccount02 {
    public static void main(String[] args) {
        Account02 account02 = new Account02(1122,20000,0.045);
        account02.withdraw(30000);
        account02.withdraw(2500);
        account02.deposit(3000);
        System.out.println("月利率为：" + account02.getMonthlyInterest() + "您的余额为：" + account02.getBalance());
    }
}
