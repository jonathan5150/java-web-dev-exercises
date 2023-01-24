package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private static Date lastUpdated = new Date();
    private ArrayList<MenuItem> menuItems = new ArrayList<>();

    public Menu(ArrayList menuItems, Date lastUpdated) {
        this.menuItems = menuItems;
        this.lastUpdated = lastUpdated;
    }

    public Menu() {
        this.menuItems = menuItems;
        this.lastUpdated = lastUpdated;
    }

    public static Date getLastUpdated() {
        return lastUpdated;
    }

    public static void setLastUpdated(Date lastUpdated) {
        Menu.lastUpdated = lastUpdated;
    }

    public void addNewItem(String menuItem) {
        MenuItem myItem = new MenuItem(menuItem);
        menuItems.add(myItem);
    }

    @Override
    public String toString() {
        return "\n" + menuItems;
    }

}
