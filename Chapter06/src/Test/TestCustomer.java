package Test;
/*
（1）创建一个Customer ，名字叫 Jane Smith, 他有一个账号为103317，余额为2000元，年利率为
1.23％ 的账户。
（2）对Jane Smith操作。
存入 100 元，再取出960元。再取出2000元。
打印出Jane Smith 的基本信息
 */
import MianXiangDuiXiang.Account;
import MianXiangDuiXiang.Customer;

import java.util.Scanner;

public class TestCustomer {
    public static void main(String[] args) {
        System.out.println("设置用户名：");
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入您的姓：");
        String firstName = scanner.next();
        System.out.print("请输入您的名：");
        String lastName = scanner.next();
        Customer customer1 = new Customer(firstName,lastName);
        Account account1 = new Account(103317,2000,0.00123);
        System.out.println("您的信息为：");
        System.out.println("您的名字为：" + customer1.getFistName() + customer1.getLastName());
        System.out.println("您的ID为：" + account1.getId());
        System.out.println("您的余额为：" + account1.getBalance());
        System.out.println("您是要存钱还是取钱？（存钱/取钱）");
        String xuanZe = scanner.next();
        if ("存钱".equals(xuanZe)){
            System.out.print("请输入您要存钱的金额：");
            double cunQian = scanner.nextDouble();
            double a = cunQian + account1.getBalance();
            account1.setBalance(a);
            System.out.println("交易后您的信息为：");
            System.out.println("您的名字为：" + customer1.getFistName() + customer1.getLastName());
            System.out.println("您的ID为：" + account1.getId());
            System.out.println("您的余额为：" + account1.getBalance());
        } else if ("取钱".equals(xuanZe)) {
            System.out.println("请输入您要取钱的金额：");
            double quQian = scanner.nextDouble();
            double a = account1.getBalance() - quQian;
            account1.setBalance(a);
            System.out.println("交易后您的信息为：");
            System.out.println("您的名字为：" + customer1.getFistName() + customer1.getLastName());
            System.out.println("您的ID为：" + account1.getId());
            System.out.println("您的余额为：" + account1.getBalance());
        }else {
            System.out.println("您的输入不符合规范！");
        }
    }

}
