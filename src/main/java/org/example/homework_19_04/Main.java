package org.example.homework_19_04;

import java.util.*;

public class Main {

    public static void main(String[] args) {
    //        Мини задачки на повторение прошлого урока, достаточно проделать то, что делали на уроке))
    //Задание 1: Сгенерировать список из 500 целочисленных элементов
    //Достаточно создать объект Random random = new Random();
    //И в цикле добавлять случайное значение в список в виде int element = random.nextInt(10);
    //Имея данный список и знания полученный об интерфейсе Set,
    //вывести в консоль:
    //1)отсортированный набор уникальных элементов
    //2)набор только уникальных элементов

        List<Integer> integers = new ArrayList<>();
        Random random = new Random();

        while (integers.size() < 500) {
            integers.add(random.nextInt(500));
            // по заданию не понятно, надо ли ставить ограничение, но я поставила, что бы наглядно показать, что в листе
            // у нас повторяющиеся элементы, а в сете количество значительно уменьшится из-за уникальности
        }
        System.out.println("Count in List: " + integers.size());

        Set<Integer> uniqueSet = new HashSet<>();
        for (int i = 0; i < integers.size(); i++) {
            uniqueSet.add(integers.get(i));
        }
        System.out.println("\nCount in HashSet: " + uniqueSet.size());
        System.out.println(uniqueSet);

        Set<Integer> sortedSet = new TreeSet<>();
        for (int i = 0; i < integers.size(); i++) {
            sortedSet.add(integers.get(i));
        }
        System.out.println("\nCount in TreeSet: " + sortedSet.size());
        System.out.println(sortedSet);
        // мы не увидим разницы в выводе, потому что целочисленные значения в любой сет добавляются отсортированными
        // из-за особенностей хэширования

    //Задание 2:
    //Взять две строки случайных символов, длина каждой строки от 20 до 50 символов.
    //Вывести в консоль список символов которые встречаются только один раз на все две строки.

        String firstStr = generateRandomString();
        System.out.println("\nFirst string length: " + firstStr.length());
        String secondStr = generateRandomString();
        System.out.println("Second string length: " + secondStr.length());

        Set<Character> characterSet = new HashSet<>();
        for (int i = 0; i < firstStr.length(); i++) {
            characterSet.add(firstStr.charAt(i));
        }
        for (int i = 0; i < secondStr.length(); i++) {
            characterSet.add(secondStr.charAt(i));
        }
        System.out.println("Unique characters for both strings: " + characterSet);
    }

    private static String generateRandomString() {
        Random random = new Random();
        int strLength = random.nextInt(20, 50);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strLength; i++) {
            stringBuilder.append((char) random.nextInt(Character.MAX_VALUE));
            // было интересно рандомно сгенерировать, но не знаю, как получить знакомые нам символы, а не иероглифы))
        }
        return stringBuilder.toString();
    }

}