package de.telran.application;

import de.telran.dao.Library;
import de.telran.data.Book;

import static de.telran.dao.Library.getMorePages;
import static de.telran.dao.Library.getOldestBook;

public class LibraryApp {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "Joahn Roaling", 1997, 2005);
        Book book2 = new Book("Winnie the Pooh", "Alex Milan", 1957, 256);
        Book book3 = new Book("Scherlock Holmes", "Artur Conan Doyle", 1892, 388);
        Book book4 = new Book("Lille prince", "Saint-Exupery", 1957, 2500);
        Book[] book = {book1, book2, book3, book4};
        Library myLib = new Library(100);
        System.out.println(myLib.getSize());
        myLib.addBook(book1);
        myLib.addBook(book2);
        myLib.addBook(book3);
        myLib.addBook(book4);
        System.out.println(myLib.getSize());
        myLib.display();
        myLib.addBook(new Book("War and Pace", "Lew Tolstoy", 1886, 678));
        System.out.println(myLib.getSize());
      /*  myLib.deleteBook(book3);
        myLib.display();*/
        System.out.println("The oldest Book is  :" + getOldestBook(book).getDataOfIssuance());
        System.out.println("The more Pages Book is  :" + getMorePages(book).getPages());
        myLib.searchBookAuthor("Alex Milan");
        myLib.searchBookAuthor("Milan");
       ;

    }
}
