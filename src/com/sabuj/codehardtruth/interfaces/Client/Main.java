package com.sabuj.codehardtruth.interfaces.Client;

import com.sabuj.codehardtruth.interfaces.Wrestlers.Kane;
import com.sabuj.codehardtruth.interfaces.Wrestlers.StoneCold;
import com.sabuj.codehardtruth.interfaces.Wrestlers.Wrestler;

/**
 * interfaces - contain all abstract methods
 * cannot be instantiated
 */
public class Main {
    public static void main(String[] args) {
        Wrestler kane = new Kane();
        kane.finisher();

        Wrestler sc = new StoneCold();
        sc.finisher();

    }
}
