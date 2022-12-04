package se.iths.twentytwo.övningsuppgifter;

import java.io.Console;
import java.util.Scanner;

public class Kontrollstrukturer {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Kontrollstrukturer v = new Kontrollstrukturer();
        v.quesFive();
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

    public void quesFive() {
        System.out.println("Skriv en månad");
        String month = sc.nextLine();
        month = month.toLowerCase();
        switch (month) {
            case "january" -> System.out.println("1");
            case "february" -> System.out.println("2");
            case "march" -> System.out.println("3");
            case "april" -> System.out.println("4");
            case "may" -> System.out.println("5");
            case "june" -> System.out.println("6");
            case "july" -> System.out.println("7");
            case "august" -> System.out.println("8");
            case "september" -> System.out.println("9");
            case "october" -> System.out.println("10");
            case "november" -> System.out.println("11");
            case "december" -> System.out.println("12");
        }
    }
}
