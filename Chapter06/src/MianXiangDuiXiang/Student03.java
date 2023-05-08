package MianXiangDuiXiang;

public class Student03 {
    private String name;
    private int age;
    //声明三个构造器
    public Student03(){
        this("liamnguang");
    }
    public Student03(String name){
        this("name",14);
        this.name = name;
    }
    public Student03(String name,int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Student03 student03 = new Student03();
        System.out.println("name = " + student03.name);
        System.out.println("age = " + student03.age);
    }
}
