package se.iths.twentytwo.övningsuppgifter;

import java.io.Console;
import java.util.Random;
import java.util.Scanner;

public class Kontrollstrukturer {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Kontrollstrukturer v = new Kontrollstrukturer();
        v.quesEleven();
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

    public void quesSix() {
        /*//ONE WAY TO GENERATE RANDOM NUMBER
        Random randomNumber = new Random();
        int secretNumber = randomNumber.nextInt(100);*/

        double randomNumber = Math.random();
        int secretNumber = (int) (randomNumber * 100 + 1);
        int guesses = 0;
        System.out.println("Skriv ett tal");
        while (true) {
            int guess = sc.nextInt();
            ++guesses;
            if (guess < secretNumber)
                System.out.println("Gissa på ett högre tal");
            else if (guess > secretNumber) {
                System.out.println("Gissa på ett lägre tal");
            } else {
                System.out.println("Grattis! Du gissade rätt i " + guesses + " gissningar");
                break;
            }
        }
    }

    public void quesSeven() {
        for (int i = 1; i < 17 ; i++) {
            System.out.println(i);
        }
    }

    public void quesEight() {
        for (int i = 21; i > 0; i--) {
            if(i % 2 == 0)
                System.out.println(i);
        }
    }

    public void quesNine() {
        int number = 65536;
        for (int i = 65536; i > 1 ; i >>= 1) {
            System.out.println(i);
            //DIVIDING i BY 2. i >>=1 IS SAME AS WRITING i = i/2
        }
    }

    public void quesTen() {
        String printWord = "";
        while(true) {
            String word = sc.nextLine();
            if (word.equals(".") || word.isEmpty())
                break;

            printWord = printWord + word + " ";
            System.out.println(printWord);
        }
    }

    public void quesEleven() {
        System.out.println("Skriv ett tal");
        int input = sc.nextInt();
        while (input > 2) {
            input = input % 2 == 0 ? input/2 : (input * 2) + 1;

            /* //SIMPLIFICATION OF WHAT THE ABOVE STATEMENT DOES
            if(input % 2 == 0) {
                input = input / 2;
            }
            else {
                input = (input * 2) + 1;
            }*/
            System.out.println(input);
        }
    }
}
