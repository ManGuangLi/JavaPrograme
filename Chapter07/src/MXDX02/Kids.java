package MXDX02;

public class Kids extends ManKind{
    private int yearsOld;
    public Kids(int sex,int salary,int yearsOld){
        super(sex,salary);
        this.yearsOld= yearsOld;
    }
    public void printAge(){
        System.out.println("你的年龄是：" + yearsOld);
    }
}
