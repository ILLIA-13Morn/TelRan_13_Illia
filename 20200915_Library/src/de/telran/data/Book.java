package de.telran.data;

import java.util.Objects;

public class Book {
    private String titles;
    private String author;
    private int dataOfIssuance;
    private int pages;

    public Book(String titles, String author, int dataOfIssuance, int pages ) {
        this.titles = titles;
        this.author = author;
        this.dataOfIssuance = dataOfIssuance;
        this.pages = pages;

    }

    public String getTitles() {
        return titles;
    }

    public void setTitles(String titles) {
        this.titles = titles;
    }

    public String getAuthor() {
        return author;
    }

    public int getDataOfIssuance() {
        return dataOfIssuance;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return dataOfIssuance == book.dataOfIssuance &&
                pages == book.pages &&
                titles.equals(book.titles) &&
                author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titles, author, dataOfIssuance, pages);
    }

    @Override
    public String toString() {
        return "Book{" +
                "titles='" + titles + '\'' +
                ", author='" + author + '\'' +
                ", dataOfIssue=" + dataOfIssuance +
                ", pages=" + pages +
                '}';
    }
}

