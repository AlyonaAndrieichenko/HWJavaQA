package org.example.homework_22_12;

public class Person {
    private String fullName;
    private int age;

    public void move(){
        System.out.println(this.fullName+" двигается");
    }

    public void talk(){
        System.out.println(this.fullName+" говорит");
    }

    public Person(){}

    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getAge() {
        return this.age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

//1.Класс Person
//Создать класс Person, который содержит:
//
//переменные fullName, age;
//методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит".
//Добавьте два конструктора  - Person() и Person(fullName, age).
//Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age)

