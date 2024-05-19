package org.example.homework_03_05.passengers;

import com.github.javafaker.Faker;

import java.util.*;

import static org.example.homework_03_05.passengers.ClassOfPassenger.*;

public class PassengersQueue {

    public static void main(String[] args) {

//  Имеется очередь пассажиров (класс Passenger), часть из которых является клиентами 1-го класса,
//  которые должны идти на посадку первыми.
//  Написать приложение, которое создаст 10 пассажиров, из них 3 пассажира 1-го класса.
//  Отправить всех в одну очередь, разбирать очередь, пока она не станет пустая.
//  Пассажиры 1 ого класса должны быть в очереди первыми.


        Comparator<Passenger> comparator = (((o1, o2) -> o1.getClassOfPassenger().compareTo(o2.getClassOfPassenger())));
        Queue<Passenger> passengers = new PriorityQueue<>(comparator);
        Faker faker = new Faker();
        for (int i = 1; i <= 10; i++) {
            Passenger currenrPassenger = new Passenger(faker.name().firstName(), ECONOMY);
            if (i % 3 == 0) currenrPassenger.setClassOfPassenger(FIRST);
            if (i == 5 || i == 10) currenrPassenger.setClassOfPassenger(BUSINESS);

            passengers.add(currenrPassenger);
        }

        System.out.println(passengers+"\n");

        for (int i = 1; i <= 10; i++) {
            Passenger currentPassenger = passengers.poll();
            System.out.println(currentPassenger + " is in the queue");
        }
    }
}
