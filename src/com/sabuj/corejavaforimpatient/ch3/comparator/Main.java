package com.sabuj.corejavaforimpatient.ch3.comparator;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Comparator interface is a functional interface
 * only 1 method - compare(a,b)
 * Lambdas can replace functional interfaces in one line
 * Behind the scenes, lambdas replace an object which implements a functional interface
 */
public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[]{
                new Car(100, "BMW"),
                new Car(200, "Mercedes"),
                new Car(50, "Volvo"),
                new Car(55, "i10")
        };

        Arrays.sort(cars, (o1, o2) -> o2.getSpeed() - o1.getSpeed());
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
