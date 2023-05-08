package MianXiangDuiXiang;
/*
定义三个重载方法max()，第一个方法求两个int值中的最大值，第二个方法求两个double值中
的最大值，第三个方法求三个double值中的最大值，并分别调用三个方法。
 */
public class OverLoad02 {
    public void max(int a,int b){
        int c = Math.max(a,b);
        System.out.println("两个整数中的最大值为："+c);
    }
    public void max(double a,double b){
        double c = Math.max(a,b);
        System.out.println("两个浮点数中的最大值："+c);
    }
    public void max(double a,double b,double c){
        double d =Math.max(a,b);
        double e =Math.max(d,c);
        System.out.println("三个浮点数的最大值："+e);
    }
}
