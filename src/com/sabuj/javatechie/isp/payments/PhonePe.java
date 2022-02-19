package com.sabuj.javatechie.isp.payments;

public class PhonePe implements UPI, MF{
    @Override
    public void pay() {

    }

    @Override
    public void receive() {

    }

    @Override
    public void mutualfund() {
        System.out.println("PhonePe MF");
    }
}
