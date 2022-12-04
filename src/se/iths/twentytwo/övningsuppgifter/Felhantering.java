package se.iths.twentytwo.övningsuppgifter;

import java.util.Scanner;

public class Felhantering {

    public static void main(String[] args) {
        while (true) {
            System.out.println("Please write a decimal number");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            try {
                Double dInput = Double.parseDouble(input);
            } catch (Exception e) {
                System.out.println("Wrong format. Try again");
                continue;
            }
            break;
        }
    }
}
