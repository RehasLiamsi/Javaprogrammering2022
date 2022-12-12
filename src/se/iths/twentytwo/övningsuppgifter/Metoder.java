package se.iths.twentytwo.övningsuppgifter;

public class Metoder {

    public static void main(String[] args) {

    }

    //Question 2a
    public static double add(double a, double b){
        return a + b;
    }

    //Question 2b
    public static double multi(double a, double b, double c){
        return a*b*c;
    }

    //Question 2c
    public static double unlimitedParameters(int... a){
        int temp = 1;
        for (int i = 0; i < a.length; i++) {
            temp *= a[i];
        }
        return temp;
    }
}
