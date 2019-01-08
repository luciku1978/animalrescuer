package org.fasttrackit;

import java.util.Date;

public class Food {
    String name;
    double price;
    int quantity;
    Date expiryDate;
    boolean availability;

    public Food(String name, double price, int quantity, Date expiryDate, boolean availability) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
        this.availability = availability;
    }
}
