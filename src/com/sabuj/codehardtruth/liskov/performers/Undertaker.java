package com.sabuj.codehardtruth.liskov.performers;

public class Undertaker extends Wrestler implements isFighting {

    public Undertaker(int scheduleToPerform, int salary) {
        super(scheduleToPerform, salary);
    }

    @Override
    public void fighting() {
        System.out.println("Undertaker is fighting Shawn Michaels");
    }

//    @Override
//    public void fighting() {
//        System.out.println("Undertaker is fighting Shawn Michaels");
//    }
}
