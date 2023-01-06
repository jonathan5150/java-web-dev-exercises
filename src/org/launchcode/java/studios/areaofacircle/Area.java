package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a radius: ");

        Double userRadius = null;
        while (userRadius == null) {
            try {
                userRadius = input.nextDouble();
                if (userRadius == null) {
                    System.out.print("Input was invalid. Please enter a valid, positive number: ");
                }
                if (userRadius < 0) {
                    System.out.print("Input was invalid. Please enter a valid, positive number: ");
                    userRadius = null;
                }
            } catch (InputMismatchException e) {
                System.out.print("Input was invalid. Please enter a valid, positive number: ");
                input.next();
            }
        }

        input.close();
        //double area = 3.14 * userRadius * userRadius;
        //double area = Circle.getArea(userRadius);
        System.out.println("The area of a circle of radius "
                            + userRadius + " is: " + (Circle.getArea(userRadius)));
    }
}
