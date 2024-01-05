package org.example.homework_22_12;

public class Main {
    public static void main(String[] args) {

//1.Класс Person
//Создать класс Person, который содержит:
//
//переменные fullName, age;
//методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит".
//Добавьте два конструктора  - Person() и Person(fullName, age).
//Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age)

        Person girl = new Person("Anna", 18);
        Person man = new Person();
        man.setFullName("Alex");
        man.move();
        girl.talk();

//2.Класс Phone.
//Создайте класс Phone, который содержит переменные number, model и weight.
//Создайте три экземпляра этого класса.
//Выведите на консоль значения их переменных.
//Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
//Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
//Вызвать эти методы для каждого из объектов.

        Phone iphone = new Phone("+380960095744", "iphone13 Pro", 250);
        Phone samsung = new Phone("+491639548113", "samsung S20", 200);
        Phone xiaomi = new Phone("+481739587164", "xiaomi Ultra", 230);

        System.out.println("IPhone: "+iphone.getNumber()+", "+iphone.getModel()+", "+iphone.getWeight()+"g.");
        iphone.receiveCall("Max");

        System.out.println("Samsung: "+samsung.getNumber()+", "+samsung.getModel()+", "+samsung.getWeight()+"g.");
        samsung.receiveCall("John");

        System.out.println("Xiaomi: "+xiaomi.getNumber()+", "+xiaomi.getModel()+", "+xiaomi.getWeight()+"g.");
        xiaomi.receiveCall("Mary");

    }
}



