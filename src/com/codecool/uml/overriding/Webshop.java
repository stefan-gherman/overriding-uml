package com.codecool.uml.overriding;

public class Webshop {

    public static void main(String[] args) {
	// write your code here
        Order order = new Order();
        Order order2 = new Order();

        System.out.println(order.toString());
        System.out.println(order2.toString());

        order.checkout();
        order2.pay();

        System.out.println(order.toString());
        System.out.println(order2.toString());

        AbstractProcess pay = new PaymentProcess();
        AbstractProcess checkout = new CHeckoutProcess();

        checkout.action(order2);
        pay.action(order);

        System.out.println(order.toString());
        System.out.println(order2.toString());

    }
}
