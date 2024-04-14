package de.telran.java_qa.homework_22_03;

import java.util.ArrayList;
import java.util.List;

public class SecondTask {
    public static void main(String[] args) {
    //  На занятии подробно разобрали свой связный список и сделали несколько методов.
    //  Попробуйте реализовать подобно методам урока в этом списке методы: removeFirst и removeLast.
    //  Добавьте два теста на эти методы, все как делали на уроке.

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);
        System.out.println(myLinkedList);

        myLinkedList.removeFirst();
        myLinkedList.removeLast();
        System.out.println(myLinkedList);


    }
}
