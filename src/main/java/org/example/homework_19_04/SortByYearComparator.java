package org.example.homework_19_04;

import java.util.Comparator;

public class SortByYearComparator implements Comparator<Book> {

    @Override
    public int compare(Book b1, Book b2) {
        return b1.getYear() - b2.getYear();
    }
}
