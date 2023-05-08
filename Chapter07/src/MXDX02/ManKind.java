package MXDX02;

public class ManKind {
    private int sex;
    private int salary;
    public ManKind(int sex,int salary){
        this.sex = sex;
        this.salary = salary;
    }
    public void manOrWoman(){
        if (sex == 1){
            System.out.println("这是男人");
        } else if (sex == 0) {
            System.out.println("这是女人");
        }
    }
    public void employed(){
        if (salary == 0) {
            System.out.println("你没有工作");
        } else if (salary != 0) {
            System.out.println("你有工作");
        }
    }
}
