package com.sabuj.codehardtruth.liskov.Client;

import com.sabuj.codehardtruth.liskov.performers.Nexus;
import com.sabuj.codehardtruth.liskov.performers.Referee;
import com.sabuj.codehardtruth.liskov.performers.Undertaker;
import com.sabuj.codehardtruth.liskov.performers.Wrestler;

/**
 * Referee has certain similarities to Wrestler class
 * but it is not fighting
 * So, extending wrestler class for referee violates LSP
 * So, we abstract out fighting into an interface because this
 * method is not common among all the subclasses.
 * It's more like an optional behaviour
 *
 *
 * final - used because the variables have no setters
 * so once it is assigned through the ctors, it is not gonna change
 * so final/constant.
 *
 * static final variables must be assigned through the static block only
 * normal final variables can only be assigned through ctors or at first only
 *
 * LISKOV - Subtypes must be substitutable for their base types.
 * So Undertaker IS A substitute of Wrestler - lsp works
 */
public class Main {
    public static void main(String[] args) {
//        Wrestler und = new Undertaker(5, 500);
//        und.isFighting();

        Undertaker undertaker = new Undertaker(5, 500);
        undertaker.fighting();

//        Wrestler nex = new Nexus(10, 1000);
        Nexus nex = new Nexus(20, 500);
        nex.fighting();

//        Wrestler ref = new Referee(50, 5000);
        Referee referee = new Referee(25, 2045);
    }
}
