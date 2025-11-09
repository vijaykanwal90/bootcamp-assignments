package org.example;

class Book{
    String author;
    String book;
    int price;
    public Book(String author, String book,int price){
        this.author = author;
        this.book= book;
        this.price= price;
    }


}

public class Question9 {
    public static void main(String[] args) {
        Book book1 = new Book("vijay","book by vijay",234);
        System.out.println(book1.price);
    }
}
