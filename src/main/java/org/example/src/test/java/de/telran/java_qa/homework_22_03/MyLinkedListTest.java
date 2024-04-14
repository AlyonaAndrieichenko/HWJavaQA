package de.telran.java_qa.homework_22_03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {

    private MyLinkedList list;

    @BeforeEach
    void init(){
        list = new MyLinkedList();
        list.add(9);
        list.add(8);
        list.add(7);
    }

    @Test
    void testRemoveFirst() {
        list.removeFirst();
        String actualListAsString = list.toString();
        assertEquals("8 7 ", actualListAsString);
    }

    @Test
    void testRemoveLast() {
        list.removeLast();
        String actualListAsString = list.toString();
        assertEquals("9 8 ", actualListAsString);
    }

}