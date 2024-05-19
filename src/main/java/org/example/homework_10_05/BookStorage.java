package org.example.homework_10_05;

import java.util.HashMap;
import java.util.Map;

public class BookStorage {
    //  Создать хранилище книг BookStorage, внутри него хранить книги в HashMap.
//  В этом хранилище(классе BookStorage) должны быть методы
//  1)Получить все книги из хранилища,
//  2)Проверить наличие книги по isbn
//  3)Добавить новую книгу в хранилище (сначала проверить, что такой книги там нет)
//  4)Получить книгу из хранилища по ее isbn.


    //    хранить книги в HashMap
    private Map<Long, Book> books = new HashMap<>();

    public BookStorage() {
    }

    //    1) Получить все книги из хранилища
    public Map<Long, Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "BookStorage {" +
                "books = " + books +
                '}';
    }

    //    2) Проверить наличие книги по isbn
    public boolean searchBookByISBN(long isbn) {
        return books.containsKey(isbn);
    }

    //  3) Добавить новую книгу в хранилище (сначала проверить, что такой книги там нет)
    public void addNewBook(Book book) {
        if (books.containsValue(book)) System.out.println("Such book is already present");
        else books.put(book.getIsbn(), book);
    }

    //  4) Получить книгу из хранилища по ее isbn.
    public Book getBookByISBN(long isbn) {
        if (books.get(isbn) == null) System.out.println("There is no book with such ISBN");
        return books.get(isbn);
    }

}