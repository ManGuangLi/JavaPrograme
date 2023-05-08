package Array;
//  P17
public class Test01 {
    public static void main(String[] args) {
        int [][] array = new int[3][];
        array[0] = new int[3];
        array[0][0] = 3;
        array[0][1] = 5;
        array[0][2] = 8;
        array[1] = new int[2];
        array[1][0] = 12;
        array[1][1] = 9;
        array[2] = new int[4];
        array[2][0] = 7;
        array[2][1] = 0;
        array[2][2] = 6;
        array[2][3] = 4;
        int s = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "" + '\t');
                s = s + array[i][j];
            }
            System.out.println();
        }
        System.out.print("这几个数的和为：" + s);
    }
}
