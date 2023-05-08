package LiuChengKongZhi;
import java.sql.SQLOutput;
import java.util.Scanner;
/*
由键盘输入三个整数分别存入变量num1、num2、num3，对它们进行排序(使用 if-else)，并且从小到大输出。
 */
public class Test06 {
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
        if (num1 > num2 && num2 > num3){
            System.out.println("这三个数从小到大排列依次是：" + num3 +"，" + num2 + "，" + num1);
        } else if (num1 > num3 && num3 > num2) {
            System.out.println("这三个数从小到大排列依次是：" + num2 +"，" + num3 + "，" + num1);
        } else if (num2 > num1 && num1 > num3) {
            System.out.println("这三个数从小到大排列依次是：" + num3 +"，" + num1 + "，" + num2);
        } else if (num2 > num3 && num3 > num1) {
            System.out.println("这三个数从小到大排列依次是：" + num1 +"，" + num3 + "，" + num2);
        } else if (num3 > num1 && num1 > num2) {
            System.out.println("这三个数从小到大排列依次是：" + num2 +"，" + num1 + "，" + num3);
        }else {
            System.out.println("这三个数从小到大排列依次是：" + num1 +"，" + num2 + "，" + num3);
        }
    }
}
/*
流程控制n个数进行比较大小在XunHuan包下面的Test01
本题的其他的解法在本包下面的Test07,Test08
 */
