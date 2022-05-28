package com.services;

public class PaymentServiceImpl implements PaymentService{
    @Override
    public void makePayment(int amount) {

        System.out.println("amount credit" + " ->" + amount);

        System.out.println("amount debit" + " ->" + amount);
    }

    @Override
    public void checkPayment() {
        System.out.println("checking ...");
    }
}
