package Test;
import MianXiangDuiXiang.Circle;
import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        System.out.print("请输入圆的半径：");
        Circle circle = new Circle();
        Scanner scanner = new Scanner(System.in);
        circle.radius = scanner.nextDouble();
        double itArea = circle.area(circle.radius);
        System.out.println("圆的面积为：" + itArea);
    }
}
