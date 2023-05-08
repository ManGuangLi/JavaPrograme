package LiuChengKongZhi;
import java.util.Scanner;
/*
定义一个整数，判定是偶数还是奇数
 */
public class Test04 {
    public static void main(String[] args) {
        System.out.print("请输入一个整数：");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a % 2 ==0){
            System.out.println("您输入的数为偶数");
        }else{
            System.out.println("您输入的数为奇数");
        }
    }
}
