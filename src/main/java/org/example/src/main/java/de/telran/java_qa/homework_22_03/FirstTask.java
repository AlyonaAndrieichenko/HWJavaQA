package de.telran.java_qa.homework_22_03;

import java.util.*;

public class FirstTask {
    public static void main(String[] args) {

    //  Небольшая задача на тему позапрошлого урока:
    //  Создать лист, наполнить его 10М (миллионами) элементов.

        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            integerList.add(i);
        }

    //  Выполнить различные варианты обхода данного листа:

    //  При выполнении операций обхода, для нагрузки, внутри тела циклов кладем i- тый элемент в переменную temp
    //  (Пример :
    //  for (int i : list) {
    //     int temp = i;
    //        })

    //  перебрать for-each loop

        long start = System.currentTimeMillis();
        for (int i : integerList) {
            int temp = i;
        }
        System.out.println("Time using for-each loop is: " + (System.currentTimeMillis() - start));

    //  classic for и вызываем внутри цикла list.size() для каждой итерации

        start = System.currentTimeMillis();
        for (int i = 0; i < integerList.size(); i++) {
            int temp = i;
        }
        System.out.println("Time using classic for is: " + (System.currentTimeMillis() - start));

    //  classic for, но list.size() определяем в переменную
        start = System.currentTimeMillis();
        int size = integerList.size();
        for (int i = 0; i < size; i++) {
            int temp = i;
        }
        System.out.println("Time using classic for, but list.size() as variable is: " + (System.currentTimeMillis() - start));

    //  classic for, list.size() определяем в переменную, перебираем с конца (i--)
        start = System.currentTimeMillis();
        int listSize = integerList.size();
        for (int i = listSize; i > 0 ; i--) {
            int temp = i;
        }
        System.out.println("Time using classic for, but list.size() as variable, iteration from end is: "
                + (System.currentTimeMillis() - start));

    //  используя Iterator
        start = System.currentTimeMillis();
        Iterator<Integer> iterator = integerList.iterator();
        while (iterator.hasNext()) {
            int temp = iterator.next();
        }
        System.out.println("Time using Iterator is: " + (System.currentTimeMillis() - start));

        //  используя ListIterator
        start = System.currentTimeMillis();
        ListIterator listIterator = integerList.listIterator();
        while (listIterator.hasNext()) {
            int temp = (int) listIterator.next();
        }
        System.out.println("Time using ListIterator is: " + (System.currentTimeMillis() - start));

    //  для всех случаев(1-6) сделать замер времени как разобрали в начале прошлого урока.
    //  Результат вывести в консоль
    }

}
