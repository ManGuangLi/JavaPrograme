package LiuChengKongZhi;
import java.util.Scanner;
/*
编写程序：从键盘上输入2023年的“month”和“day”，要求通过程序输出输入的日期为2023年的第几天。
利用case的穿透性
 */
public class Test13 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("请输入月：");
        int mouth = scanner1.nextInt();
        System.out.print("请输入日：");
        int day = scanner1.nextInt();
        int sumDay = 0;
        switch (mouth){
            case 12:
                sumDay +=00;
            case 11:
                sumDay +=30;
            case 10:
                sumDay +=31;
            case 9:
                sumDay +=30;
            case 8:
                sumDay +=31;
            case 7:
                sumDay +=31;
            case 6:
                sumDay +=30;
            case 5:
                sumDay +=31;
            case 4:
                sumDay +=30;
            case 3:
                sumDay +=31;
            case 2:
                sumDay +=28;
            case 1:
                sumDay +=31;
        }
        System.out.println("今年是2023年的第："+(sumDay+day)+"天");
    }
}
