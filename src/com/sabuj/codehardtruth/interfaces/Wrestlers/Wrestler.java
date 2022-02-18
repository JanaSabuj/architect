package com.sabuj.codehardtruth.interfaces.Wrestlers;

/** abstract class - class that contains atleast one abstract method
 * cannot be instantiated
 * can also have no methods
 * so it can have both unique methods + generic methods
*/
public abstract class Wrestler {
    public void payment(int hours) {
        System.out.println("the wrestler is paid " + hours * 500 + "for his match");
    }

    public abstract void themeMusic();
    public abstract void finisher();
}
