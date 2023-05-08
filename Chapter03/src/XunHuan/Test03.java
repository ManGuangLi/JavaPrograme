package XunHuan;
/*
遍历1-100以内的偶数，并获取偶数的个数，获取所有的偶数的和
 */
public class Test03 {
    public static void main(String[] args) {
        System.out.println("输出1到100的整数：");
        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                for (int j = 1; j < 11; j++) {
                    System.out.print("" +'\t' + j);
                }
                System.out.println("");
            }
            if (i ==1){
                for (int j = 11; j < 21; j++) {
                    System.out.print("" +'\t' + j);
                }
                System.out.println("");
            }
            if (i ==3){
                for (int j = 21; j < 31; j++) {
                    System.out.print("" +'\t' + j);
                }
                System.out.println("");
            }
        }
    }
}
/*
实现现的第一种方法,优化算法见Test04
 */