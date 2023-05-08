package MianXiangDuiXiang;

public class Test {
    public static void main(String[] args) {
        int[] a = {6,5,4,3,2,1};
        int[] b = {1};
        for (int k = 0; k <a.length-1 ; k++) {
            for (int i = 0; i < a.length-1; i++) {
                if (a[i]>a[i+1]){
                    b[0] = a[i+1];
                    a[i+1] = a[i];
                    a[i] = b[0];
                }
            }
        }
        for (int j = 0; j < a.length; j++) {
            System.out.println(a[j]);
        }
    }
}