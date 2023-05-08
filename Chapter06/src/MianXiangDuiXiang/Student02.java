package MianXiangDuiXiang;
/*
(1)定义Student类,有4个属性：
 String name;
 int age;
 String school;
 String major;
(2)定义Student类的3个构造器:
第一个构造器Student(String n, int a)设置类的name和age属性；
第二个构造器Student(String n, int a, String s)设置类的name, age 和school属性；
第三个构造器Student(String n, int a, String s, String m)设置类的name, age ,school和major属
性；
(3)在main方法中分别调用不同的构造器创建的对象，并输出其属性值。
 */
public class Student02 {
    private String name;
    private int age;
    private String school;
    private String major;
    public Student02(String name,int age){
        this.name = name;
        this.age = age;
    }
    public Student02(String name,int age,String school){
        this.name = name;
        this.age = age;
        this.school = school;
    }
    public Student02(String name,int age,String school,String major){
        this.name =name;
        this.age = age;
        this.school = school;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSchool() {
        return school;
    }

    public String getMajor() {
        return major;
    }
}
