package org.launchcode.java.studios.restaurantmenu;

public class Restaurant {

    public static void main(String[] args) {
        Menu myMenu = new Menu();
        myMenu.addNewItem("Lasagna");
        //MenuItem lasagna = new MenuItem("Lasagna", "Tasty lasagna", "Entree");
        System.out.println(myMenu.toString());
    }

}
