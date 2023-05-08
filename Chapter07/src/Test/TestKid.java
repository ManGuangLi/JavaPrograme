package Test;

import MXDX02.Kids;

import java.util.Scanner;

public class TestKid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入您的岁数：");
        int yearsOld = scanner.nextInt();
        System.out.print("如果你是男人输入1，如果你是女人输入0，请输入：");
        int sex = scanner.nextInt();
        System.out.print("请输入您的工资：");
        int salary = scanner.nextInt();
        Kids someKid = new Kids(sex,salary,yearsOld);
        someKid.printAge();
        someKid.manOrWoman();
        someKid.employed();
    }
}
