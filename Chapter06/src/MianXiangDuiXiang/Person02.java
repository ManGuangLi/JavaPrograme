package MianXiangDuiXiang;
/*
创建程序：在其中定义两个类：Person和PersonTest类。定义如下：
用setAge()设置人的合法年龄(0~130)，用getAge()返回人的年龄。在PersonTest类中实例化Person类
的对象b，调用setAge()和getAge()方法，体会Java的封装性。
 */
/*
解释：也就是说在设置的时候把类的属性给封装起来，用方法来给这样的类进行赋值或者其他的操作，其他的类里面不能直接访问，这是封装性的体现方法之一
 */
public class Person02 {
    private int age;
    public void setAge(int l){
        if (0 <= l && l <= 130){
            age = l;
        }else{
            System.out.println("您输入的年龄不符合规范！");
        }
    }
    public int getAge(){
        return age;
    }
}
