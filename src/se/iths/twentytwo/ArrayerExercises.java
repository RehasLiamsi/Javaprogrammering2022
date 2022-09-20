package se.iths.twentytwo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.random;

public class ArrayerExercises {

    public static void main(String[] args) {

        questionNine();
    }

    public static void questionOne() {
        String[] colors = {"Gul", "Grön", "Orange", "Blå", "Grå"};
        //replaced with enhanced for loop by intelliJ
        //for(int i = 0; i < colors.length; i++)
        for (String color : colors) {
            System.out.println(color);
        }
    }

    public static void questionTwo() {
        int numbers[] = new int[5];
        numbers[0] = 4;
        numbers[1] = 8;
        numbers[2] = 1;
        numbers[3] = 5;
        numbers[4] = 2;
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
    }

    public static void questionThree() {
        int myArray[] = new int[5];
        int min, max;
        Random randomNumber = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = randomNumber.nextInt(1, 31);
            System.out.println(myArray[i]);
        }
        min = max = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < min) min = myArray[i];
            if (myArray[i] > max) max = myArray[i];
        }
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 != 0) ;
            System.out.println("Odd number: " + myArray[i]);
        }
        System.out.println("The largest number is: " + max);
        System.out.println("The smallest number is: " + min);
    }

    public static void questionFour() {
        System.out.println("Write how many values you want in your array");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        int myArray[] = new int[index];

        Random randomValues = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = randomValues.nextInt();
            System.out.println(myArray[i]);
        }
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        int avrg = sum / myArray.length;
        double average = avrg;
        System.out.println("The average of all the values as a double value is " + average);
    }

    public static void questionSevenA() {
        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 8; x++) {
                if (x == y)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
            System.out.println("");
        }
    }

    public static void questionSevenB() {
        for (int y = 0; y < 4; y++) {
            for (int i = 0; i < 2; i++) {
                for (int x = 0; x < 4; x++) {
                    if (x == y)
                        System.out.print("#");
                    else
                        System.out.print("-");
                }
            }
            System.out.println("");
        }
    }

    public static void questionSevenC() {
        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 4; x++) {
                if (x == y)
                    System.out.print("##");
                else
                    System.out.print("--");
            }
            System.out.println("");
        }
    }

    public static void questionSevenD() {
        for (int y = 0; y < 4; y++) {
            for (int i = 0; i < 2; i++) {
                for (int x = 0; x < 3; x++) {
                    if (x == 2)
                        System.out.print("#");
                    else if (y == 2)
                        System.out.print("#");
                    else
                        System.out.print("-");
                }
            }
            System.out.println("");
        }
    }

    public static void questionEight() {
        int temp = 0;
        int[] myArray = new int[5];
        Random randomNumber = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = randomNumber.nextInt(1, 21);
            System.out.println("My unsorted array: " + myArray[i]);
        }
        for (int i = 0; i < myArray.length - 1; i++) {
            for (int j = 0; j < myArray.length - i - 1; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                }

            }
        }
            System.out.println("Array after sorting: " + Arrays.toString(myArray));
        }

        public static void questionNine() {
        int[][] array2D = new int[][]{ {1,2} , {3,4}, {5,6}, {7,8} };
            for (int i = 0; i <array2D.length ; i++) {
                for (int j = 0; j < array2D[i].length; j++) {
                    System.out.print(array2D[i][j] + " ");
                }
            }
        }

        public static void questionTen() {

        }


}

