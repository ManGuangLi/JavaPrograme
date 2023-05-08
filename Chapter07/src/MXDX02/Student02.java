package MXDX02;
//通过super关键字指定调用父类的哪个构造器，如果没有指定会自动调用父类的无参构造
public class Student02 extends Person {
    private long number;
    private int math;
    private int english;
    private int computer;
    public Student02(String name,char gender,int age,long number,int math,int english,int computer){
        super(name, gender, age);
        this.number = number;
        this.math = math;
        this.english = english;
        this.computer = computer;
    }
    public void print(){
        super.print();
        System.out.println("您的学号是：" + number);
        System.out.println("您的数学成绩是：" + math + "分");
        System.out.println("您的英语成绩是：" + english + "分");
        System.out.println("您的计算机成绩是：" + computer + "分");
    }
}
