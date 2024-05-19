package org.example.homework_10_05;


public class BookStorageApp {
    public static void main(String[] args) {
//        Создать класс Book с полями isbn, title, pages
//  Создать хранилище книг BookStorage, внутри него хранить книги в HashMap.
//  В этом хранилище(классе BookStorage) должны быть методы
//  1)Получить все книги из хранилища,
//  2)Проверить наличие книги по isbn
//  3)Добавить новую книгу в хранилище (сначала проверить, что такой книги там нет)
//  4)Получить книгу из хранилища по ее isbn.
//
//  В коде основной программы, создать хранилище, создать 5 книг, добавить их в хранилище
//  с помощью методов, упомянутых ранее.
//  Получить список книг и вывести в консоль.
//  Получить любую книгу и вывести в консоль.
//  Добавить новую книгу и после вывести список книг в консоль.

//        создать хранилище,
        BookStorage bookStorage = new BookStorage();

//        создать 5 книг,
        Book detective = new Book("Sherlock Holmes", 9_781_435_167_902L, 1392);
        Book fantasy = new Book("The little prince", 9_780_156_012_195L, 161);
        Book tragedy = new Book("Faust", 9_783_150_000_014L, 480);
        Book fairytale = new Book("Alice in Wonderland", 9_780_333_290_392L, 160);
        Book dystopia = new Book("Fahrenheit 451", 9_781_451_690_316L, 224);

//        добавить их в хранилище
        bookStorage.addNewBook(detective);
        bookStorage.addNewBook(fairytale);
        bookStorage.addNewBook(dystopia);
        bookStorage.addNewBook(fantasy);

//      Получить список книг и вывести в консоль.
//      System.out.println(bookStorage);
        System.out.println(bookStorage.getBooks());

//      Получить любую книгу и вывести в консоль.
        System.out.println("\n" + bookStorage.getBookByISBN(9_781_435_167_902L));

//      Добавить новую книгу и после вывести список книг в консоль.
        bookStorage.addNewBook(tragedy);
        System.out.println("\n" + bookStorage.getBooks());

        System.out.println("\nBook storage contains book you're looking for: " + bookStorage.searchBookByISBN(9_781_435_167_902L));
    }
}
