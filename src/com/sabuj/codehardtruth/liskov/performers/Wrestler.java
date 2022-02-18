package com.sabuj.codehardtruth.liskov.performers;


public abstract class Wrestler {
    private final int scheduleToPerform;
    private final int salary;

    public Wrestler(int scheduleToPerform, int salary) {
        this.scheduleToPerform = scheduleToPerform;
        this.salary = salary;
    }

    public int getScheduleToPerform() {
        return scheduleToPerform;
    }

    public int getSalary() {
        return salary;
    }

//    public abstract void fighting();
}
