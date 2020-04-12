package com.codecool.uml.overriding;

public class CHeckoutProcess extends AbstractProcess {
    @Override
    protected void action(Orderable item) {
        System.out.println("Checkout done");
        item.checkout();
    }
}
