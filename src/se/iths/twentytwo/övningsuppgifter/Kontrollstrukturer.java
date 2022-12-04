package se.iths.twentytwo.övningsuppgifter;

import java.io.Console;
import java.util.Scanner;

public class Kontrollstrukturer {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Kontrollstrukturer v = new Kontrollstrukturer();
        v.quesFour();
    }

    public void quesThree() {
        String myPassword = "12345";
        Console console = System.console();
        System.out.print("Skriv in lösenordet: ");
        String input = sc.nextLine();
        if (myPassword.equals(input)) {
            System.out.println("Rätt lösenord");
        }
        else
            System.out.println("Fel lösenord");

        //ANOTHER SOLUTION
        /*char[] enteredPassword = System.console().readPassword();

        String enteredPasswordString = String.valueOf(enteredPassword);
        if (enteredPasswordString.equals(myPassword)) {
            System.out.println("Rätt lösenord!");
        } else {
            System.out.println("Fel lösenord!");
        }*/
    }

    public void quesFour() {
        System.out.print("Skriv ett tal: ");
        int number = sc.nextInt();
        if(number < 100)
            System.out.println("Talet är mindre än 100");
        else if (number > 100)
            System.out.println("Talet är större än 100");
        else
            System.out.println("Talet är lika med 100");
    }
}
