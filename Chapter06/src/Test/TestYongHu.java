package Test;

import MianXiangDuiXiang.YongHu;

import java.util.Scanner;

public class TestYongHu {
    public static void main(String[] args) {
        YongHu yongHu = new YongHu();
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入您的用户名：");
        yongHu.userName = scanner.nextLine();
        System.out.print("请输入您的密码：");
        yongHu.passWorld = scanner.next();
        System.out.println(yongHu.userName instanceof String);
        System.out.println(yongHu.passWorld instanceof  String);
        yongHu.login(yongHu.userName, yongHu.passWorld);
    }
}
