package com.sabuj.corejavaforimpatient.ch3.comparable;

import java.util.Arrays;

/**
 * Comparable - only one definition for comparing the objects
 * Classes like String isn't ours to modify
 */
public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[]{
                new Car(100, "BMW"),
                new Car(200, "Mercedes"),
                new Car(50, "Volvo"),
                new Car(55, "i10")
        };

        Arrays.sort(cars);
        for (Car car : cars) {
            System.out.println(car);
        }

        String[] strs = new String[]{
                "Sabuj", "Jana", "Abc", "Aba"
        };
        Arrays.sort(strs);
        for (String str:strs
             ) {
            System.out.println(str);
        }
    }
}
