package Test;

import MXDX02.CheckAccount;

public class TestCheckAccount {
    public static void main(String[] args) {
        CheckAccount checkAccount = new CheckAccount(1122,20000,0.045);
        checkAccount.withdraw(30000);
    }
}
