package org.java;

public class Books {
    public static void main(String[] args) {
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", "July 11th, 1960");
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "April 10th, 1925");

        book1.print();
        System.out.println();
        book2.print();
    }
}

class Book {
    String Title;
    String Author;
    String PubDate;

    public Book(String Title, String Author, String PubDate){
        this.Title = Title;
        this.Author = Author;
        this.PubDate = PubDate;
    }

    public void print(){
        System.out.println("The title is: " + Title);
        System.out.println("The author is: " + Author);
        System.out.println("The publishing date is: " + PubDate);
    }
}

