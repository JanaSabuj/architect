package com.sabuj.codehardtruth.liskov.performers;

public class Nexus extends Wrestler implements isFighting{

    public Nexus(int scheduleToPerform, int salary) {
        super(scheduleToPerform, salary);
    }

    @Override
    public void fighting() {
        System.out.println("Nexus is fighting Shield");
    }

//    @Override
//    public void fighting() {
//        System.out.println("Nexus is fighting Shield");
//    }
}
