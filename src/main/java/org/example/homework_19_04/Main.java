package org.example.homework_19_04;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    // Задача первая!
    //Есть класс книга. У книги есть название, автор, год издания, количество страниц. Автор является отдельным классом

        //У нескольких книг может быть один и тот же автор
        Author stephenKing = new Author("Stephen", "King");

        //Создать 10 книг и поместить их в список
        Book detective = new Book("Sherlock Holmes", new Author("Arthur", "Conan Doyle"), 1887, 1392);
        Book fantasy = new Book("The little prince", new Author("Antone", "de Saint-Exupery"), 1943, 161);
        Book tragedy = new Book("Faust", new Author("Johann", "Wolfgang Goethe"), 1832, 480);
        Book fairytale = new Book("Alice in Wonderland", new Author("Lewis", "Carroll"), 1865, 160);
        Book dystopia = new Book("Fahrenheit 451", new Author("Ray", "Bradbury"), 1953, 224);
        Book drama = new Book("Romeo and Juliet", new Author("William", "Shakespeare"), 1597, 384);
        Book biography = new Book("Steve Jobs", new Author("Walter", "Isaacson"), 2015, 592);
        Book horror = new Book("The Shining", stephenKing, 1977, 447);
        Book darkFantasy = new Book("It", stephenKing, 1986, 1138);
        Book gothic = new Book("The green mile", stephenKing, 1996, 496);

        List<Book> bookList = Arrays.asList(
                detective, fantasy, tragedy, fairytale, dystopia, drama, biography, horror, darkFantasy, gothic);

        //Создать несколько вариантов сортировки:
        //1- По названию книги,
        //2- По имени автора,
        //3-По количеству страниц у книги
        //4-По году издания

        System.out.println("Choose type of sort:" +
                "\n 1 - By name of book" +
                "\n 2 - By name of author" +
                "\n 3 - By page count" +
                "\n 4 - By year of publishing");

        //С консоли запросить ввод варианта сортировки в виде числа от 1 до 4
        //В зависимости от того, какое число ввели отсортировать коллекцию нужным компаратором

        Scanner scanner = new Scanner(System.in);
        int sortNum = scanner.nextInt();

        while (sortNum < 1 || sortNum > 4) {
            System.out.println("Please, choose 1, 2, 3, or 4");
            sortNum = scanner.nextInt();
        }

        if (sortNum == 1) {
            Collections.sort(bookList, new SortByNameComparator());
            System.out.println("Sorted by name of book: " + bookList);
        } else if (sortNum == 2) {
            Collections.sort(bookList, new SortByAuthorComparator());
            System.out.println("Sorted by name of author:\n" + bookList);
        } else if (sortNum == 3) {
            Collections.sort(bookList, new SortByPagesComparator());
            System.out.println("Sorted by page count:\n" + bookList);
        } else {
            Collections.sort(bookList, new SortByYearComparator());
            System.out.println("Sorted by year of publishing:\n" + bookList);
        }

        //Задача вторая!

        //Написать метод equals и hashcode для следующих классов:

        //public class Book {
        //private String name;
        //private Author author;
        //
        //public Book(String name, Author author) {
        //    this.name = name;
        //    this.author = author;
        //}
        //}
        //

        //public class Author {
        //private String name;
        //private String surname;
        //public Author(String name, String surname) {
        //    this.name = name;
        //    this.surname = surname;
        //}
        //}
    }
}
