package com.sabuj.javatechie.isp.Client;

import com.sabuj.javatechie.isp.payments.GooglePay;
import com.sabuj.javatechie.isp.payments.PhonePe;
import com.sabuj.javatechie.isp.payments.UPI;

/**
 * Except GooglePay, other 2 fintechs have a MF platform
 * So, GooglePay is FORCED to implement an empty/defunct mutualfund() which violates ISP
 * So we break up / segregate the interface into 2 parts
 */
public class Main {
    public static void main(String[] args) {
        PhonePe phonePe = new PhonePe();
        phonePe.mutualfund();

        GooglePay googlePay = new GooglePay();
//        googlePay.mutualfund();

    }
}
