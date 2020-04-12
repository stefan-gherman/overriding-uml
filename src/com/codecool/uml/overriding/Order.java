package com.codecool.uml.overriding;

public class Order implements Orderable {

    private int id = 0;
    private static int incrementer = 0;
    String status = "new";

    public Order() {
        this.id = incrementer;
        incrementer +=1;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public boolean checkout() {
      this.status = "checked";
      return true;
    }

    @Override
    public boolean pay() {
        this.status = "payed";
        return true;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", status='" + status + '\'' +
                '}';
    }
}
