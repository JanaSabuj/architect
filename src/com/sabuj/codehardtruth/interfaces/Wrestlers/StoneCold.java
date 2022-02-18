package com.sabuj.codehardtruth.interfaces.Wrestlers;

public class StoneCold implements Wrestler{
    @Override
    public void payment() {
        System.out.println("Paid SC");
    }

    @Override
    public void themeMusic() {
        System.out.println("Mudracer");
    }

    @Override
    public void finisher() {
        System.out.println("Stunner");
    }
}
