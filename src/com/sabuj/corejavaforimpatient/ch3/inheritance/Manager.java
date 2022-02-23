package com.sabuj.corejavaforimpatient.ch3.inheritance;

public class Manager extends Employee{
    double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        System.out.println("Overridden method is called");
        return super.getSalary() + bonus;
    }
}
