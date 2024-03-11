package org.example.homework_01_03_2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2, 5, 6, 8, 9);
        System.out.println(multiplyElements(integerList));

        List<String> stringList = Arrays.asList("Hello", "Hi", "Good Morning");
        System.out.println(getStringLength(stringList));

        List<Integer> integers = Arrays.asList(5, 7, 8, 2, 4, 9);
        System.out.println(getOddNumbers(integers));

        List<String> strings = Arrays.asList("List", "Without", "Without", "Duplicates", "List");
        System.out.println(getListWithoutDuplicates(strings));
    }

    //    Немного домашки на списки :
//      1.у вас есть список значений int и вы должны вернуть список, каждое значение которого умножается на 2
    public static List<Integer> multiplyElements(List<Integer> integerList) {
        for (int i = 0; i < integerList.size(); i++) {
            integerList.set(i, integerList.get(i) * 2);
        }
        return integerList;
    }

    //      2.у вас есть список значений String , и вы должны вернуть список длины каждого из этих значений String .
    public static List<Integer> getStringLength(List<String> stringList) {
        List<Integer> integerList = new ArrayList<>();
        for (String s : stringList) {
            integerList.add(s.length());
        }
        return integerList;
    }

    //      3.у вас есть список значений int и вы должны вернуть список, содержащий только нечетные числа
    public static List<Integer> getOddNumbers(List<Integer> integerList) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) % 2 != 0) oddNumbers.add(integerList.get(i));
        }
        return oddNumbers;
    }

    //      4.у вас есть список значений String , и вы должны вернуть список этих значений без каких-либо дубликатов.
    public static List<String> getListWithoutDuplicates(List<String> stringList) {
        List<String> listWithoutDuplicates = new ArrayList<>();
        for (String s : stringList) {
            if (!(listWithoutDuplicates.contains(s))) listWithoutDuplicates.add(s);
        }
        return listWithoutDuplicates;
    }
}
