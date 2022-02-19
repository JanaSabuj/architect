package com.sabuj.corejavaforimpatient.ch3.comparable;

public class Car implements Comparable<Car>{
    private int speed;
    private String name;

    public Car(int speed, String name) {
        this.speed = speed;
        this.name = name;
    }

    @Override
    public int compareTo(Car o) {
        return this.speed - o.speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", name='" + name + '\'' +
                '}';
    }
}
