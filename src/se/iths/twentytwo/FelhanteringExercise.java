package se.iths.twentytwo;

import java.util.Scanner;

public class FelhanteringExercise {

    public static void main(String[] args) {
        //create a boolean to help the do while loop
        boolean correctFormat = true;
        //start loop
        do {
        System.out.println("Please write a decimal number");
        Scanner sc =new Scanner(System.in);
        String input;
        input = sc.nextLine();
            try {
                Double dInput = Double.parseDouble(input);
                correctFormat = false; //if the input format was correct, the boolean would turn to false and stop the loop
            } catch (Exception e) {
                System.out.println("Wrong format. Try again");
            }
        } while (correctFormat); //it would keep on looping while the boolean in true; i.e the format was not correct
    }
}
