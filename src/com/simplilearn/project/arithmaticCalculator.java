package com.simplilearn.project;

import java.util.Scanner;

public class arithmaticCalculator {

    public static void main(String[] args) {
        //Create new scanner object
        Scanner numInput = new Scanner( System.in );

        //Enter first number
        System.out.println("Please enter the first number: ");
        int num1 = numInput.nextInt();

        //Enter the second number
        System.out.println("Please enter the second number: ");
        int num2 = numInput.nextInt();

        //Choose the operation to perform (+,-,*,/)
        System.out.println("What operation would you like to do?");
        System.out.println("Type \"+\" to add.");
        System.out.println("Type \"-\" to subtract.");
        System.out.println("Type \"*\" to multiply.");
        System.out.println("Type \"/\" to divide.");
        
        Scanner op = new Scanner( System.in );
        String opChoice = op.nextLine();


        //Add
        if (opChoice.equals("+")) {
            int ans = num1 + num2;
            System.out.println("Adding " + num2 + " to " + num1 + " equals " + ans + ".");
        }

        //Subtract
        else if (opChoice.equals("-")) {
            int ans = num1 - num2;
            System.out.println("Subtracting " + num2 + " from " + num1 + " equals " + ans + ".");
        }

        //Multiply
        else if (opChoice.equals("*")) {
            int ans = num1 * num2;
            System.out.println("Multiplying " + num2 + " with " + num1 + " equals " + ans + ".");
        }

        //Divide
        else if (opChoice.equals("/")) {
            int ans = num1 / num2;
            System.out.println("Dividing " + num1 + " by " + num2 + " equals " + ans + ".");
        }

    }

}