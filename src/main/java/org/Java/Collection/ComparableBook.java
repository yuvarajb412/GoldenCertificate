package org.Java.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableBook {
    public static void main(String[] args) {

        List<Book> books= new ArrayList<>();

        books.add(new Book("","anand"));
        books.add(new Book("","yuvaraj"));
        books.add(new Book("","hemnath"));

        System.out.println(books.toString());
        Collections.sort(books);
        System.out.println(books.toString());

    }
}
class Book implements Comparable<Book>{

    private  String name;
    private  String author;

    public Book(String name,String author) {
        this.name = name;
        this.author=author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int compareTo(Book book){

        return this.author.compareTo(book.author);
    }

    public String toString(){
        return this.name+" "+this.author;
    }
}
