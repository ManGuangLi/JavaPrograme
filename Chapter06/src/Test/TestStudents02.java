package Test;

import MianXiangDuiXiang.Student02;

public class TestStudents02 {
    public static void main(String[] args) {
        Student02 student02 = new Student02("lamnguang",21);
        System.out.println("Student02的名字是：" + student02.getName());
        System.out.println("Student02的年龄是：" + student02.getAge());
        System.out.println("Student02的学校是：" + student02.getSchool());
        System.out.println("Student02的职业是：" + student02.getMajor());
        System.out.println("************************************************");
        Student02 student03 = new Student02("lmangunag",21,"ZZU","Student");
        System.out.println("Student03的名字是：" + student03.getName());
        System.out.println("Student03的年龄是：" + student03.getAge());
        System.out.println("Student03的学校是：" + student03.getSchool());
        System.out.println("Student03的职业是：" + student03.getMajor());
    }
}
