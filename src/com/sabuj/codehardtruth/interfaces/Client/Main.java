package com.sabuj.codehardtruth.interfaces.Client;

import com.sabuj.codehardtruth.interfaces.Wrestlers.Kane;
import com.sabuj.codehardtruth.interfaces.Wrestlers.StoneCold;
import com.sabuj.codehardtruth.interfaces.Wrestlers.Wrestler;

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
