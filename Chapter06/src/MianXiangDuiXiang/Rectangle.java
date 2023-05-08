package MianXiangDuiXiang;
/*
（1）定义矩形类Rectangle，包含长、宽属性，area()返回矩形面积的方法，perimeter()返回矩形周长
的方法，String getInfo()返回圆对象的详细信息（如：长、宽、面积、周长等数据）的方法
（2）在测试类中创建长度为3的Rectangle[]数组，用来装3个矩形对象，并给3个矩形对象的长分别赋
值为10,20,30，宽分别赋值为5,15,25，遍历输出
 */
public class Rectangle {
    public double length;
    public double width;
    public double area(double length,double width){
        double mianJi =length * width;
        return mianJi;
    }
    public  double perimeter(double length,double width){
        double zhouChang = (length + width) * 2;
        return  zhouChang;
    }
    public String getInfo(double length,double width){
        System.out.println("这个矩形的长为：" + length);
        System.out.println("这个矩形的宽为：" + width);
        System.out.println("这个矩形的面积为：" + area(length,width));
        System.out.println("这个矩形的周长为：" + perimeter(length,width));
        return "这个矩形的详细信息为：";
    }
}
/*
public String getInfo(){
return "长：" + length +
"，宽：" + width +
"，面积：" + area() +
"，周长：" + perimeter();
}
题目上要求是这么返回的
 */
