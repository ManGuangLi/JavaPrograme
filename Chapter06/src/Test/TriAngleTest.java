package Test;

import MianXiangDuiXiang.TriAngle;

import java.util.Scanner;

public class TriAngleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入底边的长度：");
        double base = scanner.nextDouble();
        System.out.print("请输入三角形的高：");
        double height = scanner.nextDouble();
        TriAngle triAngle = new TriAngle(base,height);
        System.out.println("您输入的三角形的底边长为：" + triAngle.getBase());
        System.out.println("您输入的三角形的高为：" + triAngle.getHeight());
        triAngle.area(base,height);
    }
}

