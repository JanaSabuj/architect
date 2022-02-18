package com.sabuj.codehardtruth.abstractclasses.Wrestlers;


public abstract class Wrestler {
    public void payment(int hours) {
        System.out.println("the wrestler is paid " + hours * 500 + "for his match");
    }

    public abstract void themeMusic();
    public abstract void finisher();
}
