package javabasics;

public class Factorial {
    // factorial
    public static void main(String[] args) {
        int i,factorial = 1;
        int num = 5;
        for(i = 1; i<=num; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial " + num + " is: " + factorial);
    }
}
