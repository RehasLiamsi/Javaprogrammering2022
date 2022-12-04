package se.iths.twentytwo.övningsuppgifter;

public class Arrayer {

    public static void main(String[] args) {
        quesTwo();
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
}
