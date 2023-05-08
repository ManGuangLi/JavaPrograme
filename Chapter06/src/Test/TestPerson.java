package Test;
import MianXiangDuiXiang.Person;

public class TestPerson {
    public static void main(String[] args) {
        Person p = new Person();
        //System.out.println(p);
        p.name= "LiXiaoMing";
        p.age = 18;
        p.gender = '男';
        p.printThis(12,13);
    }
}
