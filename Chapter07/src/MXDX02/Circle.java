package MXDX02;

public class Circle {
    private double radius;
    public Circle(){

    }
    public Circle(double radius){
        this.radius = 1;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double findArea(double radius){
        double area = Math.PI * radius * radius;
        return area;
    }
}
