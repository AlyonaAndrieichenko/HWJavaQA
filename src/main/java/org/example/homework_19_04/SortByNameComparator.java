package org.example.homework_19_04;

import java.util.Comparator;

public class SortByNameComparator implements Comparator<Book> {

    @Override
    public int compare(Book b1, Book b2) {
        String one = b1.getName();
        String two = b2.getName();
        return one.compareTo(two);
    }
}
