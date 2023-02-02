package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string and this function will return the number of occurrences of each character: ");
        //String text = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        String text = input.nextLine().toLowerCase();
        input.close();

        char[] charArray = text.toCharArray();

        HashMap<Character, Integer> charMap = new HashMap<>();

        String testABC = "abcdefghijklmnopqrstuvwxyz";
        ArrayList<Character> testABCArray = new ArrayList<Character>();
        for (char character : testABC.toCharArray()) {
            testABCArray.add(character);
        }

        for (char character : charArray) {
            if (testABCArray.contains(character)) {
                if (!charMap.containsKey(character)) {
                    charMap.put(character, 1);
                } else {
                    charMap.put(character, (charMap.get(character) + 1));
                }
            }
        }

        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            System.out.println(entry.getKey() +": " + entry.getValue());
        }

    }
}
