package Test;

import MXDX02.Cylinder;

import java.util.Scanner;

public class TestCylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入半径：");
        double radius = scanner.nextDouble();
        System.out.print("请输入高度：");
        double length = scanner.nextDouble();
        Cylinder cylinder = new Cylinder(radius,length);
        System.out.println("圆的面积：" + cylinder.findArea(radius));
        System.out.println("圆柱的体积：" + cylinder.findVolume(radius,length));;
    }
}
