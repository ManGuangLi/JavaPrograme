package MianXiangDuiXiang;
/*
利用面向对象的编程方法，设计圆类Circle，包含属性（半径）和计算圆面积的方法。定义测试
类，创建该Circle类的对象，并进行测试。
 */
public class Circle {
    //半径：radius
    public double radius;
    //面积：area
    public double area (double radius){
        double pi = Math.PI;
        double itArea = pi * radius *radius;
        return itArea;
    }
}
