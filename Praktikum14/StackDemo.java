package Praktikum14;

import java.util.Stack;
public class StackDemo {
    public static void main(String[] args) {
        book book1 = new book("1234", "Dasar pemrograman");
        book book2 = new book("7145", "Hafalah surat Delisa");
        book book3 = new book("3562", "Muhammad Al-Fatih");

        Stack<book>books = new Stack<>();
        books.push(book1);
        books.push(book2);
        books.push(book3);

        book temp = books.peek();
        if (temp != null) {
           System.out.println(temp.toString()); 
        }
        book temp2 = books.pop();
        if (temp2 != null) {
            System.out.println(temp2.toString());
        }
        for(book book : books) {
            System.out.println(book.toString());
        }
        System.out.println(books);
    }
}
