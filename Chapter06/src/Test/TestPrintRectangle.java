package Test;

import MianXiangDuiXiang.PrintRectangle;

import java.util.Scanner;

public class TestPrintRectangle {
    public static void main(String[] args) {
        PrintRectangle printRectangle = new PrintRectangle();
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入这个矩形的长度：");
        printRectangle.length = scanner.nextDouble();
        System.out.print("请输入这个矩形的宽度：");
        printRectangle.width = scanner.nextDouble();
        printRectangle.method();
        double itArae = printRectangle.area(printRectangle.length, printRectangle.width);
        System.out.println("这个矩形的面积为："+itArae);

    }
}
/*
说明：对象的数据类型在调用的时候，必须指明是那个对象的属性
例如：printRectangle.length, printRectangle.width
 */