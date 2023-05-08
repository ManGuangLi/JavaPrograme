package Test;

import MianXiangDuiXiang.Overload;

public class TestOverload {
    public static void main(String[] args) {
        int a = 2,b = 4;
        String c = "我爱你";
        Overload overload =new Overload();
        overload.moL(a);
        overload.moL(a,b);
        overload.moL(c);
    }
}
