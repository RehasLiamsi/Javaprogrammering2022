package se.iths.twentytwo.övningsuppgifter;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Metoder {

    public static void main(String[] args) {
        System.out.println("Question 2a: " + add(1.4, 2.5));
        System.out.println("Question 2b: " + multi(2.5, 2, 5));
        System.out.println("Question 2c: " + unlimitedParameters(2, 5, 4, 6, 7));
        System.out.print("Question 3: ");
        quesThree("Timmy", "New York", (byte) 3);
        System.out.print("Question 4 with wrong format: ");
        stringToIntConverter("Tim");
        System.out.print("Question 4 with correct format: ");
        stringToIntConverter("4");
        System.out.println("Question 5: " + addPrefixAndSuffixToString("Wow"));
        System.out.println("Question 6: " + daysInMonth(Month.MARCH));
        System.out.println("Question 7: " + substringOfWord("abcde"));
        System.out.print("Question 8 with wrong format: ");
        year("21-11-02");
        System.out.print("Question 8 with correct format: ");
        year("2021-11-02");
        System.out.print("Question 9: ");
        daysBetween("2017-08-30", "2017-09-02");
        System.out.println("Question 10: 259 fahrenheit = " + fahrenheitToCelsius(259) + " celsius");
        System.out.println("Question 11a: " + sumOf100Numbers());
        System.out.println("Question 11b: " + sumOfNumbers(15));
        System.out.println("Question 12: Piano backwards is = " + backwardsString("piano"));
        System.out.println("Question 13: Is 37 a prime number? " + isPrimeNumber(37));
        System.out.println("Question 13: Is 50 a prime number? " + isPrimeNumber(50));
        System.out.println("Question 14: " + average(3,4));
        System.out.println("Question 14: " + average(2,3,4));
        System.out.println("Question 14: " + average(2,3,4,5));
        System.out.println("Question 14: " + average(2,3,4,5,6));
        System.out.println("Question 15: " + factorial(5));
        System.out.println("Question 15 variation: " + factorial2(4));
    }

    //Question 2a
    public static double add(double a, double b) {
        return a + b;
    }

    //Question 2b
    public static double multi(double a, double b, double c) {
        return a * b * c;
    }

    //Question 2c
    public static double unlimitedParameters(int... a) {
        int temp = 1;
        for (int i = 0; i < a.length; i++) {
            temp *= a[i];
        }
        return temp;
    }

    public static void quesThree(String name, String city, byte favoriteNumber) {
        System.out.println("Välkommen " + name + " från " + city + " med favorittal " + favoriteNumber);
    }

    //Question Four
    public static void stringToIntConverter(String number) {
        try {
            System.out.println(Integer.parseInt(number));
        } catch (NumberFormatException e) {
            System.out.println("Fel format!");
        }
    }

    //Question Five
    public static String addPrefixAndSuffixToString(String input) {
        return "<p>" + input + "</p>";
    }

    //Question Six
    enum Month {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }

    public static int daysInMonth(Month month) {
        return switch (month) {
            case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> 31;
            case FEBRUARY -> 28;
            case APRIL, JUNE, SEPTEMBER, NOVEMBER -> 30;
        };
    }

    //Question Seven
    public static String substringOfWord(String word) {
        return word.substring(0, 3);
    }

    //Question Eight
    public static void year(String input) {
        if (input.length() == 10) {
            String substring = input.substring(0, 4);
            System.out.println(Integer.parseInt(substring));
        } else {
            System.out.println("Wrong date format");

        }
    }

    //Question Nine
    public static void daysBetween(String dateBefore, String dateAfter) {
        LocalDate dateOne = LocalDate.parse(dateBefore);
        LocalDate dateTwo = LocalDate.parse(dateAfter);

        long noOfDaysBetween = ChronoUnit.DAYS.between(dateOne, dateTwo);
        System.out.println("Days between are " + noOfDaysBetween);
    }

    //Question Ten
    public static double fahrenheitToCelsius(double fahrenheit) {
        return ((fahrenheit - 32) * 5) / 9;
    }

    //Question Eleven a
    public static int sumOf100Numbers() {
        int sum = 0;
        for (int i = 0; i < 101; i++) {
            sum += i;
        }
        return sum;
    }

    //Question Eleven b
    public static int sumOfNumbers(int numberOfNumbersToAdd) {
        int sum = 0;
        for (int i = 0; i <= numberOfNumbersToAdd; i++) {
            sum += i;
        }
        return sum;
    }

    //Question Twelve
    public static String backwardsString(String word) {
        char ch;
        String reverseWord = "";
        for (int i = 0; i < word.length(); i++) {
            ch = word.charAt(i);
            reverseWord = ch + reverseWord;
        }
        return reverseWord;
    }

    //Question Thirteen
    public static boolean isPrimeNumber(int number) {
        boolean flag = true;
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    //Question Fourteen
    public static int average(int number1, int number2) {
        return (number1 + number2) / 2;
    }

    public static int average(int number1, int number2, int number3) {
        return (number1 + number2 + number3) / 2;
    }

    public static int average(int number1, int number2, int number3, int number4) {
        return (number1 + number2 + number3 + number4) / 2;
    }

    public static int average(int number1, int number2, int number3, int number4, int number5) {
        return (number1 + number2 + number3 + number4 + number5) / 2;
    }

    //AVANCERADE UPPGIFTER/REKURSION

    //Question Fifteen
    public static int factorial(int number){
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    //Question Fifteen variation
    public static int factorial2(int number){
        if (number == 1)
            return 1;
        else
            return (number * factorial2(number - 1));
    }
}
