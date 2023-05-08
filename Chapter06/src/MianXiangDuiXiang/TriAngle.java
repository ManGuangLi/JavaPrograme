package MianXiangDuiXiang;
/*
编写两个类，TriAngle和TriAngleTest，其中TriAngle类中声明私有的底边长base和高height，
同时声明公共方法访问私有变量。此外，提供类必要的构造器。另一个类中使用这些公共方法，计算三
角形的面积。
 */
public class TriAngle {
    //声明私有属性
    private double base;
    private double height;
    //提供类的构造器
    public TriAngle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    //设置公共方法访问私有属性
    public void setBase(double base) {
        this.base = base;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    //设置得到此属性的方法
    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
    //计算三角形的面积
    public void area(double base,double height){
        double area = 0.5 * base * height;
        System.out.println("这个三角形的面积为：" + area);
    }
}
