package LiuChengKongZhi;
import java.util.Scanner;
/*
使用switch-case实现：对学生成绩大于60分的，输出“合格”。低于60分的，输出“不合格”。
 */
public class Test12 {
    public static void main(String[] args) {
        //写法一
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        boolean a = (score > 60.0);
        String b = "" + a;
        System.out.println(b);
        switch (b) {
            case "true":
                System.out.println("合格");
                break;
            default:
                System.out.println("不合格");
        }
        //写法2：
        switch (score / 10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("不及格");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("及格");
                break;
            default:
                System.out.println("输入的成绩有误");
                break;
        }
//写法3：
        switch (score / 60) {
            case 0:
                System.out.println("不及格");
                break;
            case 1:
                System.out.println("及格");
                break;
            default:
                System.out.println("输入的成绩有误");
                break;
        }
    }
}
