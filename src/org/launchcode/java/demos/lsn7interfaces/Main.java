package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        Comparator comparator = new FlavorComparator();
        Comparator comparator1 = new ConeComparator();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.


        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        //flavors.sort(comparator);

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        System.out.println("Flavors before: \n");

        for ( Flavor flavor : flavors) {
            System.out.print(flavor.getName());
            System.out.println("");
        }

        flavors.sort(comparator);

        System.out.println("\nFlavors after: \n");
        //cones.sort();
        for ( Flavor flavor : flavors) {
            System.out.print(flavor.getName());
            System.out.println("");
        }

        System.out.println("\nPrice before: \n");

        for ( Cone cone : cones) {
            System.out.print(cone.getName() + ": $");
            System.out.printf("%.2f", cone.getCost());
            System.out.println("");
        }

        cones.sort(comparator1);

        System.out.println("\nPrice after: \n");

        for ( Cone cone : cones) {
            System.out.print(cone.getName() + ": $");
            System.out.printf("%.2f", cone.getCost());
            System.out.println("");
        }

    }
}
