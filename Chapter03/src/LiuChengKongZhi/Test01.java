package LiuChengKongZhi;

/**
 * 分支语句的三个结构
 * 1、单分支
 * 2、双分支
 * 3、多分支条件判断
 * 4、嵌套
 */
public class Test01 {
    public static void main(String[] args) {
        int a = 20, b = 10;
        int c;
        if (a > b){
            c = a;
            a = b;
            b = c;
        }
        System.out.println("small = " + a + '\n' + "big = " + b);
    }
}
