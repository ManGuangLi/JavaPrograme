package Test;

import MianXiangDuiXiang.Person02;

import java.util.Scanner;

public class PersonTest02 {
    public static void main(String[] args) {
        Person02 person02 = new Person02();
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入您的年龄：");
        int l = scanner.nextInt();
        person02.setAge(l);
        System.out.println("您的年龄为：" + person02.getAge());
    }
}