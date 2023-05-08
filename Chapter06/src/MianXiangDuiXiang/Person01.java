package MianXiangDuiXiang;
/*
练习1：创建一个Person类，其定义如下：
要求：
(1)创建Person类的对象，设置该对象的name、age和gender属性，调用study方法，输出字符串
“studying”，调用showAge()方法显示age值，调用addAge()方法给对象的age属性值增加2岁。
(2)创建第二个对象，执行上述操作，体会同一个类的不同对象之间的关系。
 */
public class Person01 {
    public String name;
    public int age;
    public char gender;
    public void study(){
        System.out.println("Studying");
    }
    public void  showAge(){
        System.out.println("我的年纪是："+ age+ "岁");
    }
    public void addAge(){
        age = age +2;
        System.out.println("再过两年，我就："+age+"岁了");
    }
}
