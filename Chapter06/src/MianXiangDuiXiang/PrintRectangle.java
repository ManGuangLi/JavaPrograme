package MianXiangDuiXiang;
/*
编写程序，声明一个method方法，在方法中打印一个 10*8的*型矩形 ，在main方法中调用该方法。
在method方法中，除打印一个 10*8的*型矩形 外，再计算该矩形的面积，并将其
作为方法返回值。在main方法中调用该方法，接收返回的面积值并打印。
修改上一个程序，在method方法提供m和n两个参数，方法中打印一个 m*n的*型矩形 ，并计算该矩
形的面积， 将其作为方法返回值。在main方法中调用该方法，接收返回的面积值并打印。
 */
public class PrintRectangle {
    public double length;
    public double width;
    //public int hangShu;
    //public int lieShu;
    public void method(){
        System.out.println("打印这个矩形的结果如下：");
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*"+'\t');
            }
            System.out.println("");
        }
    }
    public double area(double length,double width){
        double itArea = length * width;
        return itArea;
    }
}
