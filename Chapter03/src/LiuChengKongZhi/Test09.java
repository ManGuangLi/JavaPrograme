package LiuChengKongZhi;
/*
语句块只有一条执行语句时，一对 {}可以省略 ，但建议保留
此题输出atguigu
 */
public class Test09 {
    public static void main(String[] args) {
        int x = 4;
        int y = 1;
        if (x > 2) {
            if (y > 2)
                System.out.println(x + y);
                System.out.println("atguigu");
        } else
            System.out.println("x is " + x);
    }
}
