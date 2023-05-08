package MXDX02;

public class Cylinder extends Circle {
    private double length;

    public Cylinder(double radius,double length) {
        super(radius);
        this.length = 1;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }
    public double findVolume(double radius,double length){
        double area = super.findArea(radius) *length;
        return area;
    }
}
