package com.sabuj.codehardtruth.abstractclasses.Client;

import com.sabuj.codehardtruth.abstractclasses.Wrestlers.Kane;
import com.sabuj.codehardtruth.abstractclasses.Wrestlers.StoneCold;
import com.sabuj.codehardtruth.abstractclasses.Wrestlers.Wrestler;

public class Main {
    public static void main(String[] args) {
        Wrestler kane = new Kane();
        kane.themeMusic();
        kane.finisher();
        kane.payment(5);

        Wrestler sc = new StoneCold();
        sc.themeMusic();
        sc.finisher();
        sc.payment(6);
    }
}
