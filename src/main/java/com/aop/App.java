package com.aop;

import com.services.PaymentService;
import com.services.PaymentServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {


        ApplicationContext context  = new ClassPathXmlApplicationContext("config.xml");
        PaymentService payment = context.getBean("payment", PaymentService.class);
        payment.makePayment(10);
        payment.checkPayment();
    }
}
