package de.telran.dao;

import de.telran.data.Book;

import java.util.Arrays;

public class Library {
    private Book[] books;
    private int size;

    public Library(int capacity) {
        books = new Book[capacity];
        size = 0;
    }
    //Library library = new Library (60);
    //books -> empty array
    //library.size -> 0

    public int getSize() {
        return size;
    }

    public boolean addBook(Book book) {
        if (size < books.length) {
            books[size] = book;
            size++;
            return true;
        }
        return false;
    }

    public boolean deleteBook(Book book) {
        for (int i = 0; i < size; i++) {
            if (books[i].equals(book)) {
                books[i] = books[size - 1];
                size--;
                return true;
            }
        }
        return false;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    public void searchBookAuthor(String author) {
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().equalsIgnoreCase(author)) {
                flag = true;
                System.out.println(books[i]);
            }
        }
        if (!flag)
            System.out.println("Books not found!");
    }

    public static Book getOldestBook(Book[] books) {
        Book b = books[0];
        for (int i = 1; i < books.length; i++) {
            if (books[i].getDataOfIssuance() < b.getDataOfIssuance()) {
             b = books[i];
            }
        }
        return b;
    }

    public static Book getMorePages(Book[] book) {
        Book b = null;
        int largest = 0;
        for (Book books : book) {
            if (books.getPages() > largest) {
                largest = books.getDataOfIssuance();
                b = books;
            }
        }
        return b;
    }
}
