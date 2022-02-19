package com.sabuj.javatechie.dip.Client;

import com.sabuj.javatechie.dip.Card.BankCard;
import com.sabuj.javatechie.dip.Card.CreditCard;
import com.sabuj.javatechie.dip.Card.DebitCard;

/**
 * ShoppingMall client depends on the abstraction BankCard,
 * not on individual bankcards
 */
public class ShoppingMall {
    private BankCard bankCard;

    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void payment(double amount) {
        bankCard.payment(amount);
    }

    public static void main(String[] args) {
        BankCard bankCard = new DebitCard();
        ShoppingMall shoppingMall = new ShoppingMall(bankCard);
        shoppingMall.payment(500);

        BankCard bankCard1 = new CreditCard();
        ShoppingMall shoppingMall1 = new ShoppingMall(bankCard1);
        shoppingMall1.payment(1000);
    }
}
