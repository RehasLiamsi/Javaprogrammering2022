package se.iths.twentytwo.övningsuppgifter;

import java.util.Scanner;

public class VariablerOperatorerDatatyper {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        VariablerOperatorerDatatyper v = new VariablerOperatorerDatatyper();
        v.quesThree();
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
}
