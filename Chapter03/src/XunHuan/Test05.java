package XunHuan;
/*
输出所有的水仙花数，所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身。例
如： 153 = 1*1*1 + 3*3*3 + 5*5*5
 */
public class Test05 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int a,b,c;
            a = i / 100;
            b = (i % 100)/10;
            c = i % 10;
            if (i == a*a*a+b*b*b+c*c*c){
                System.out.println(i);
            }
        }
    }
}
