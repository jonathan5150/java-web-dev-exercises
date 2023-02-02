package org.launchcode.java.studios.restaurantmenu;

import java.util.Date;
public class MenuItem {

    private String name;
    private String description;
    private String category;
    private double price;
    private Date dateAdded;

    public MenuItem(String name, String description, double price, String category) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.dateAdded = new Date();
    }

    public MenuItem(String name) {
        this.name = name;
        this.description = "";
        this.category = "";
        this.price = 0.00;
        this.dateAdded = new Date();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public boolean isItemNew() {
        return true;
    };

    @Override
    public String toString() {
        return "Name: " + name + "\n Description: " + description + "\n Category: " + category + "\n Price: $" + price +  "\n Date Added: " + dateAdded;
    }
}
