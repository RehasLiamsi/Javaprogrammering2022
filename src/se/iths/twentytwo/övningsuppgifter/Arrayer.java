package se.iths.twentytwo.övningsuppgifter;

import java.util.Random;
import java.util.Scanner;

public class Arrayer {

    public static void main(String[] args) {
        quesSevenK();
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
            if (numbers[i] < min)
                min = numbers[i];
            if (numbers[i] > max)
                max = numbers[i];
            if (numbers[i] % 2 != 0)
                oddNumbers++;
        }
        System.out.println("Minsta talet i arrayen är " + min);
        System.out.println("Största talet i arrayen är " + max);
        System.out.println(oddNumbers + " talen är udda i arrayen");
    }

    public static void quesFour() {
        Scanner sc = new Scanner(System.in);
        Random randomNumber = new Random();
        System.out.println("Hur lång vill du ha din array?");
        int arrayLength = sc.nextInt();
        int[] array = new int[arrayLength];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = randomNumber.nextInt();
            System.out.println(array[i]);
            sum += array[i];
        }
        System.out.println("Summan för alla värden i arrayen är " + sum);
        double average = sum / arrayLength;
        System.out.println("Medelvärdet för alla värden i arrayen är " + average);
    }

    public static void quesSevenA() {
        int rows = 4;
        int columns = 8;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (j == i)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
            System.out.println("");
        }
    }

    public static void quesSevenB() {
        int rows = 4;
        int columns = 8;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (j == i || j == i + 4)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
            System.out.println("");
        }
    }

    public static void quesSevenC() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == i)
                    System.out.print("##");
                else
                    System.out.print("--");
            }
            System.out.println("");
        }
    }

    public static void quesSevenD() {
        int rows = 4;
        int columns = 8;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == 2 || j == 2 || j == 5)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
            System.out.println("");
        }
    }

    public static void quesSevenE() {
        int x = 4;
        int rows = 4;
        int columns = 8;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (j == i || j == x)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
            x--;
            System.out.println("");
        }
    }

    public static void quesSevenF() {
        int rows = 2;
        int bundles = 2;
        int columns = 4;
        for (int i = 0; i < bundles; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < columns; k++) {
                    if (k == j || k == j + 2)
                        System.out.print("#");
                    else
                        System.out.print("-");
                }
                System.out.println("");
            }
        }
    }

    public static void quesSevenG() {
        for (int row = 0; row < 4; row++) {
            for (int column = 0; column < 6; column++) {
                if (row < 3 && column < 3)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
            System.out.println("");
        }
    }

    public static void quesSevenH() {
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 8; col++) {
                if (col == row + 2 || col > 5 && row < 2)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
            System.out.println();
        }
    }

    public static void quesSevenI() {
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                if (col == 2 && row != 2)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
            System.out.println("");
        }
    }

    public static void quesSevenJ() {
        int x = 4;
        for (int row = 0; row < 5; row++) {
            for (int column = 0; column < 5; column++) {
                if (row == 2 && column == 2)
                    System.out.print("o");
                else if (column == row || column == x)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
            x--;
            System.out.println("");
        }
    }

    public static void quesSevenK() {
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 8; col++) {
                if (row < 2 && col % 2 == 1)
                    System.out.print("--");
                else if (row == 2 && col < 3)
                    System.out.print("ww");
                else if (row == 2)
                    System.out.print("~~");
                else
                    System.out.print("##");
            }
            System.out.println("");
        }
    }
}


