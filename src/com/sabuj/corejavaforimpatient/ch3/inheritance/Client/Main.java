package com.sabuj.corejavaforimpatient.ch3.inheritance.Client;

import com.sabuj.corejavaforimpatient.ch3.inheritance.Employee;
import com.sabuj.corejavaforimpatient.ch3.inheritance.Manager;

import java.util.ArrayList;

/**
 * Private members - secrets you never tell anybody, not even your own objects
 *                 - only accessible my instance methods
 * Protected members - family secrets
 *                   - only accessible my subclasses in same package
 *
 * Why Employee e = new Manager(); this is because it allows us to write code
 * which is generic for all employees, be it manager or caretaker
 *
 * So, e has access to only those methods that Employee class has but their
 * versions may be overridden by the subclasses
 */
public class Main {
    public static void main(String[] args) {
        Employee e = new Manager("Sabuj", 50, 20);
        if (e instanceof Manager){
            ((Manager) e).setBonus(50);
        }
        System.out.println(e.getSalary());

        Manager[] mga = new Manager[10];
        Employee[] empls = mga;
        mga[0] = new Manager("Sabuj", 50, 20);
//        empls[1] = new Employee("Sabuj", 50); // ArrayStoreException at runtime

        System.out.println(e.getClass().getName());// final method in Object class


        /**
         * anonymous subclass
         */
        ArrayList<Integer> arrayList = new ArrayList<>() {
            @Override
            public boolean add(Integer integer) {
                System.out.println("Added " + integer);
                return super.add(integer);
            }
        };

        arrayList.add(55);
        arrayList.add(25);
    }
}
