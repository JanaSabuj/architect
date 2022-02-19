package com.sabuj.javatechie.dip.Card;

public class CreditCard implements BankCard{

    @Override
    public void payment(double amount) {
        System.out.println("Debited " + amount + " from CC");
    }
}
