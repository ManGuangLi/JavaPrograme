package MianXiangDuiXiang;
/*
自定义图书类。设定属性包括：书名bookName，作者author，出版社名publisher，价格price；方法
包括：相应属性的get/set方法，图书信息介绍等。
 */
public class Book {
    private String bookName;
    private String author;
    private  String publisher;
    private  double price;
    public void setBook(String a,String b,String c,double d){
        bookName = a;
        author = b;
        publisher = c;
        price = d;
    }
    public void getBook(){
        System.out.println("这本书的名字是：" + bookName);
        System.out.println("这本书的作者是："+ author);
        System.out.println("这本书的出版社是： "+ publisher);
        System.out.println("这本书的价钱是："+ price + "元");
    }
}
