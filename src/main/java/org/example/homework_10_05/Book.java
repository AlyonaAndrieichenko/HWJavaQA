package org.example.homework_10_05;

import java.util.Objects;

public class Book {
//        Создать класс Book с полями isbn, title, pages
    private String title;
    private long isbn;
    private int pages;

    public Book(String title, long isbn, int pages) {
        this.title = title;
        this.isbn = isbn;
        this.pages = pages;
    }

    public long getIsbn() {
        return isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isbn == book.isbn && pages == book.pages && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, isbn, pages);
    }

    @Override
    public String toString() {
        return "Book {" +
                "title = '" + title + '\'' +
                ", isbn = " + isbn +
                ", pages = " + pages +
                "}\n";
    }
}
