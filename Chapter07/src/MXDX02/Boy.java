package MXDX02;
/*\
添加必要的构造器，综合应用构造器的重载，this关键字。
 */
public class Boy {
    private String name;
    private int age;
    public void setAge(String name){
        this.name = name;
    }
    public void setName(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
