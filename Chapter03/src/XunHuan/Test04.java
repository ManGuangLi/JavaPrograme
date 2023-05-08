package XunHuan;
/*
遍历1-100以内的偶数，并获取偶数的个数，获取所有的偶数的和
 */
public class Test04 {
    public static void main(String[] args) {
        int s = 0,sum = 0;
        //遍历1到100的整数并且每十个为一行输出
        System.out.println("1到100所有的整数为：");
        for (int i = 1; i < 101; i = i + 10) {
            for (int j = i; j < (i +10); j++) {
                System.out.print("" +'\t' + j);
            }
            System.out.println("");
        }
        System.out.println("其中偶数为：");
        for (int i = 1; i < 101; i = i + 10) {
            for (int j = i; j < (i +10); j++) {
                if (j % 2 == 0) {
                    System.out.print("" + '\t' + j);
                    s++;
                    sum += j;
                }
            }
            System.out.println("");
        }
        System.out.println("其中偶数的个数为：" + s +"个");
        System.out.println("其中所有偶数的和为：" + sum);
    }
}
