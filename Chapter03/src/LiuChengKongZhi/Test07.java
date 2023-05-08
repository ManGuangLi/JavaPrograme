package LiuChengKongZhi;
import java.util.Scanner;
/*
由键盘输入三个整数分别存入变量num1、num2、num3，对它们进行排序(使用 if-else)，并且从小到大输出。
使用if的嵌套
 */
public class Test07 {
    public static void main(String[] args) {
        System.out.print("请输入第一个数：");
        Scanner scanner1 = new Scanner(System.in);
        int num1 = scanner1.nextInt();
        System.out.print("请输入第二个数：");
        Scanner scanner2 = new Scanner(System.in);
        int num2 = scanner2.nextInt();
        System.out.print("请输入第三个数：");
        Scanner scanner3 = new Scanner(System.in);
        int num3 = scanner3.nextInt();
        if (num1 > num2 && num1 >num3){
            if (num2 > num3){
                System.out.println("这三个数从小到大排列依次为：" +num3 + "," + num2 + "," + num1);
            }else {
                System.out.println("这三个数从小到大排列依次为：" +num2 + "," + num3 + "," + num1);
            }
        }else if (num2 > num1 && num2 >num3){
            if (num1 > num3){
                System.out.println("这三个数从小到大排列依次为：" +num3 + "," + num1 + "," + num2);
            }else {
                System.out.println("这三个数从小到大排列依次为：" +num1 + "," + num3 + "," + num2);
            }
        }else {
            if (num1 > num2){
                System.out.println("这三个数从小到大排列依次为：" +num2 + "," + num1 + "," + num3);
            }else {
                System.out.println("这三个数从小到大排列依次为：" +num1 + "," + num2 + "," + num3);
            }
        }
    }
}
