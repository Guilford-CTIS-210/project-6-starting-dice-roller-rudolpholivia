package edu.guilford;

//Olivia Rudolph
//9-19-2024

import java.util.Random; //imports the random number generator
import java.util.Scanner; //imports the scanner

public class Main {
    public static void main(String[] args) {

        Random rand = new Random(); //creates a new random list
        Scanner scan = new Scanner(System.in); //creates a new scanner input

        System.out.println("This program rolls a number of dice and totals the rolls."); //explains the game
        System.out.print("How many sides should each die have? "); //asks the user how many sides the dice should have
        int sides = scan.nextInt(); //creates an integer input "sides" for the user to enter the number of sides the dice should have
        System.out.print("How many dice should be rolled? "); //asks the user how many dice should be rolled
        int number = scan.nextInt(); //creates an integer input "number" for the user to enter the number of dice that should be rolled.

        int sum = 0; //creates an integer called sum and sets it to 0. Set to 0 because adding to it (line 27) and you can't add to something that has a nonexistant value

        // default for loop, prints loop variable as it counts up
        for (int i = 0; i < number; i++) { //creates a for loop under the starting condition that there is a new int "i" equal to 0, and the loop will run until it is greater than or equal to "number", and add 1 to "i" each time it completes.
            int diceRoll = rand.nextInt(1,(sides + 1)); //creates a random integer [1, # of sides inputted]. Without the (sides + 1), it would be [1, # of sides).
            //System.out.println("Die #" + (i + 1) + "'s roll is " + diceRoll);
            sum += diceRoll; //sums up the dice outcomes
            //System.out.println("The sum of " + (i + 1) + "d" + sides + " = " + sum);
        }

        System.out.println(number + "d" + sides + " = " + sum); //prints the sum of the outcomes
        
        scan.close(); //closes the scanner - resource leak if not done
    }
}