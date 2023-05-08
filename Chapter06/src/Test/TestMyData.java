package Test;

import MianXiangDuiXiang.MyData;

public class TestMyData {
    public static void main(String[] args) {
        MyData myData = new MyData();
        myData.day = 29;
        myData.month = 11;
        myData.year = 2001;
        System.out.println("我的生日是："+ myData.year+ "年"+myData.month+"月"+myData.day+"日");
        MyData myDuiXiang = new MyData();
        myDuiXiang.day = 23;
        myDuiXiang.month = 02;
        myDuiXiang.year = 1999;
        System.out.println("我的生日是："+ myDuiXiang.year+ "年"+myDuiXiang.month+"月"+myDuiXiang.day+"日");
    }
}
