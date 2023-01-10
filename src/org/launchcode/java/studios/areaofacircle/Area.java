package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput;
        double userInputDouble;

        System.out.print("Enter a rus: ");

        while (true) {
            try {
                userInput = input.nextLine();

                if (userInput.equals("")) {
                    System.out.print("Your input for the radius was empty. Please enter a valid, positive number: ");
                    continue;
                }

                userInputDouble = Double.parseDouble(userInput); //This line is where the try-catch statement "catches" the NumberFormatException error in case the userInput isn't a number type.

                if (userInputDouble >= 0) {
                    break; 
                }
                else {
                    System.out.print("Your input for the radius was negative. Please enter a valid, positive number: ");
                }

            } catch (NumberFormatException e) {
                System.out.print("Your input for the radius was either empty or contained illegal characters. Please enter a valid, positive number: ");
            }
        }

        input.close();

        System.out.println("The area of a circle of radius " + userInputDouble + " is: " + (Circle.getArea(userInputDouble)));
    }
}
