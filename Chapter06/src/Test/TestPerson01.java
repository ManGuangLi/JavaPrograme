package Test;
import MianXiangDuiXiang.Person01;

public class TestPerson01 {
    public static void main(String[] args) {
        Person01 person01 = new Person01();
        person01.age=18;
        person01.gender='男';
        person01.name="世界你好";
        person01.study();
        person01.showAge();
        person01.addAge();
    }
}
