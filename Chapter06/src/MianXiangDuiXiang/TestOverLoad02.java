package MianXiangDuiXiang;

public class TestOverLoad02 {
    public static void main(String[] args) {
        int a = 3,b = 2;
        double c = 2.0,d =3.0, e = 4.0;
        OverLoad02 overLoad02 = new OverLoad02();
        overLoad02.max(a,b);
        overLoad02.max(c,d);
        overLoad02.max(c,d,e);
    }
}
