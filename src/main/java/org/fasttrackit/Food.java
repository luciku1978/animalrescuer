package org.fasttrackit;

public class Food {
    private String name;
    private double price;
    private int quantity;
    private String expiryDate;
    private boolean availability;

    public Food(String name, double price, int quantity, String expiryDate, boolean availability) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
        this.availability = availability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
