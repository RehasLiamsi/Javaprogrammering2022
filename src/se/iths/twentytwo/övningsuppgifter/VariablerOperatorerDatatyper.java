package se.iths.twentytwo.övningsuppgifter;

import java.util.Scanner;

public class VariablerOperatorerDatatyper {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        VariablerOperatorerDatatyper v = new VariablerOperatorerDatatyper();
        v.quesSeven();
    }

    public void quesTwo() {
        System.out.print("Vad är ditt namn: ");
        String name = sc.nextLine();
        System.out.println("Hej " + name + "!");
    }

    public void quesThree() {
        System.out.print("Vad är ditt namn: ");
        String name = sc.nextLine();
        System.out.print("Skriv ditt ålder: ");
        String input = sc.nextLine();
        int age = Integer.parseInt(input);
        //ANOTHER SOLUTION
        //int age = sc.nextInt();
        System.out.println("Hej " + name + " som är " + age + " år gammal!");
    }

    public void quesFour() {
        System.out.print("Skriv ett tal: ");
        int digitOne = sc.nextInt();
        System.out.print("Skriv ett tal till: ");
        int digitTwo = sc.nextInt();
        int sum = digitOne + digitTwo;
        int product = digitOne * digitTwo;
        System.out.println("Summan är " + sum);
        System.out.println(("Produkten är " + product));
    }

    public void quesFive() {
        System.out.print("Skriv ett decimaltal: ");
        String input = sc.nextLine();
        double number = Double.parseDouble(input);
        int roundedNumber = (int) number;
        //ANOTHER SOLUTION
        //int roundedNumber = (int) Math.round(number);
        System.out.println("Talet är nu " + roundedNumber);
    }

    public void quesSix() {
        System.out.print("Skriv ett tal: ");
        int digitOne = sc.nextInt();
        System.out.print("Skriv ett tal till: ");
        int digitTwo = sc.nextInt();
        int average = (digitTwo + digitOne) / 2;
        System.out.println("Medelvärdet är " + average);
    }

    public void quesSeven() {
        System.out.print("Skriv hur mycket pengar du har på bankkontot: ");
        String input = sc.next();
        double balance = Double.parseDouble(input);
        System.out.print("Skriv räntesatsen i procent: ");
        double interestInput = sc.nextDouble();
        double interest = interestInput / 100;
        double amount = balance + (balance * interest);
        System.out.println("Saldot på kontot är " + amount);
    }
}
