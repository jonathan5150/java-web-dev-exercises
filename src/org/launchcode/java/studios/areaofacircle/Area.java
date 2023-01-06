package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a radius: ");

        String userInput;
        double userInputDouble;
        while (true) {
            userInput = input.nextLine();
            if (userInput.equals("") || userInput.contains(" ")) {
                System.out.print("Input was empty or invalid. Please enter a valid, positive number: ");
                continue;
            }
            try {
                userInputDouble = Double.parseDouble(userInput);
                if (userInputDouble >= 0) {
                    break;
                }
                else {
                    System.out.print("Input was negative. Please enter a valid, positive number: ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Input was of the wrong type. Please enter a valid, positive number: ");
            }
        }

        input.close();

        System.out.println("The area of a circle of radius " + userInputDouble + " is: " + (Circle.getArea(userInputDouble)));
    }
}
