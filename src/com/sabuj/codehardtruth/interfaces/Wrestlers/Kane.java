package com.sabuj.codehardtruth.interfaces.Wrestlers;

public class Kane implements Wrestler {

    @Override
    public void payment() {
        System.out.println("Paid");
    }

    @Override
    public void themeMusic() {
        System.out.println("KANEEE");
    }

    @Override
    public void finisher() {
        System.out.println("Choke Slam");
    }
}
