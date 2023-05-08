package Array;
//     P18
public class Test02 {
    public static void main(String[] args) {
        int [][] yangHui = new int[10][];
        for (int i = 0; i < yangHui.length; i++) {
            yangHui[i] = new int[i + 1];
            yangHui[i][0] = 1;
            int k = yangHui[i].length;
            yangHui[i][k-1] = 1;
        }
            for (int j = 2; j < yangHui.length; j++) {
                for (int k = 1; k < (yangHui[j].length -1); k++) {
                    yangHui[j][k] = yangHui[j-1][k] + yangHui[j-1][k-1];
                }
            }
            for (int s = 0;s < yangHui.length;s++){
                for (int m = 0; m < yangHui[s].length; m++) {
                    System.out.print(yangHui[s][m] + "" + '\t');
                }
                System.out.println();
            }
    }
}
