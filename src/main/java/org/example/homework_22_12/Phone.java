package org.example.homework_22_12;

public class Phone {
    private String number;
    private String model;
    private int weight;

    public Phone(String number, String model, int weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }


    public String getNumber() {
        return this.number;
    }

    public String getModel() {
        return this.model;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void receiveCall(String nameCalling){
        System.out.println("Звонит "+nameCalling);
    }
}

//2.Класс Phone.
//Создайте класс Phone, который содержит переменные number, model и weight.
//Создайте три экземпляра этого класса.
//Выведите на консоль значения их переменных.
//Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
//Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
//Вызвать эти методы для каждого из объектов.