package LiuChengKongZhi;
import java.util.Scanner;
/*
练习4：小明参加期末Java考试，通过考试成绩，判断其Java等级，成绩范围[0,100]
90-100 优秀
80-89 好
70-79 良
60-69 及格
60以下 不及格
 */
public class Test02 {
    public static void main(String[] args) {
        System.out.print("请输入你的成绩：");
        Scanner xiaoMing = new Scanner(System.in);
        int score = xiaoMing.nextInt();
        if (score > 100){
            System.out.println("输入格式有错误，您的成绩应该在0到100之间");
        }else if (90 <= score && score <= 100){
            System.out.println("您的成绩为优秀");
        } else if (80 <= score && score <90) {
            System.out.println("您的成绩为好");
        } else if (70 <= score && score < 80) {
            System.out.println("您的成绩为良");
        } else if (60 <= score && score <70) {
            System.out.println("您的成绩为及格");
        }else {
            System.out.println("不好意思您的成绩不及格");
        }
    }
}
