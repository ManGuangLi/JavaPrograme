package Test;

import MianXiangDuiXiang.Rectangle;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle();
        rectangles[0].length = 10;
        rectangles[0].width = 5;
        rectangles[1] = new Rectangle();
        rectangles[1].length = 20;
        rectangles[1].width = 15;
        rectangles[2] = new Rectangle();
        rectangles[2].length =30;
        rectangles[2].width = 20;
        for (int i = 0; i < rectangles.length; i++) {
            System.out.println(rectangles[i].getInfo(rectangles[i].length,rectangles[i].width) );
        }
    }
}
