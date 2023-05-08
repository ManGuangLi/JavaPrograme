package Test;

import MianXiangDuiXiang.Book;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book();
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入书名：");
        String bookName = scanner.next();
        System.out.print("请输入作者名：");
        String author = scanner.next();
        System.out.print("请输入出版社：");
        String publisher = scanner.next();
        System.out.print("请输入价钱：");
        double price = scanner.nextDouble();
        book.setBook(bookName,author,publisher,price);
        book.getBook();
    }
}
