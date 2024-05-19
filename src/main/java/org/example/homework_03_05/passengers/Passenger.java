package org.example.homework_03_05.passengers;

import java.util.Objects;

public class Passenger {
    private String name;
    private ClassOfPassenger classOfPassenger;

    public Passenger(String name, ClassOfPassenger classOfPassenger) {
        this.name = name;
        this.classOfPassenger = classOfPassenger;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClassOfPassenger getClassOfPassenger() {
        return classOfPassenger;
    }

    public void setClassOfPassenger(ClassOfPassenger classOfPassenger) {
        this.classOfPassenger = classOfPassenger;
    }

    @Override
    public String toString() {
        return "Passenger: " + name + ", class: " + classOfPassenger;
    }
}
