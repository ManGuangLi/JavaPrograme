package MXDX02;

public class Person {
    //声明人的属性
    private String name;
    private char gender;
    private int age;
    //在这里如果没有提供默认的构造器那么在子类中要声明父类的构造器
//    public Person(){
//
//    }
    //提供构造器
    public Person(String name,char gender,int age){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    //提供get 和 set 方法
    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
    //声明在Person类中的方法
    public void print(){
        System.out.println("您的姓名是："+name);
        System.out.println("您的年龄是："+age);
        System.out.println("您的性别是："+gender);
    }

}
