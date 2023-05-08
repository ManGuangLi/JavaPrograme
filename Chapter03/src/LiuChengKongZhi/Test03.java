package LiuChengKongZhi;
import java.util.Scanner;
/*
成年人心率的正常范围是每分钟60-100次。体检时，如果心率不在此范围内，则提示需要做进一步的检查。
 */
public class Test03 {
    public static void main(String[] args) {
        System.out.print("请输入你的心跳次数：");
        Scanner scanner = new Scanner(System.in);
        int xinTiao = scanner.nextInt();
        if (60 <= xinTiao && xinTiao <= 100){
            System.out.println("您的心跳正常");
        }else {
            System.out.println("您需要做进一步的检查");
        }
    }
}
