package com.sabuj.javatechie.dip.Card;

public class DebitCard implements BankCard{
    @Override
    public void payment(double amount) {
        System.out.println("Debited " + amount + " from DC");
    }
}
