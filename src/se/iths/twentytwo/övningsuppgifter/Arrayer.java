package se.iths.twentytwo.övningsuppgifter;

import java.util.Random;

public class Arrayer {

    public static void main(String[] args) {
        quesThree();
    }

    public static void quesOne() {
        String[] colors = {"Gul", "Grön", "Orange", "Blå", "Grå"};
        for (String color : colors) {
            System.out.println(color);
        }
        //SIMPLIFIED VERSION OF ABOVE FOR LOOP
        //for(int i = 0; i < colors.length; i++)
    }

    public static void quesTwo() {
        int[] numbers = {2, 3, 5, 8, 13, 21, 34};
        int sum = 0;

        /*for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }*/

        for (int i = 0; i < numbers.length; i++) {
            sum = i % 2 == 0 ? sum + numbers[i] : sum - numbers[i];
            /* //SIMPLIFIED VERSION OF ABOVE STATEMENT
            if (i % 2 == 0)
                sum += numbers[i];
            else
                sum -= numbers[i];*/
        }
        System.out.println(sum);
    }

    public static void quesThree() {
        int[] numbers = new int[5];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int oddNumbers = 0;
        Random randomNumber = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = randomNumber.nextInt(100);
            System.out.println(numbers[i]);
            if (numbers[i] < min) {
                min = numbers[i]; }
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] % 2 != 0) {
                oddNumbers++;
            }
        }
        System.out.println("Minsta talet i arrayen är " + min);
        System.out.println("Största talet i arrayen är " + max);
        System.out.println(oddNumbers + " talen är udda i arrayen");

    }
}
