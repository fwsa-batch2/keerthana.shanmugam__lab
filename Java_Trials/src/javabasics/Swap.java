package javabasics;

public class Swap {
    //swaping two numbers
    public static void main(String[] args) {
        int one = 1;
        int two = 2;

        int num = one;
        one = two;
        two = num;
        System.out.println("number1 " + one);
        System.out.println("number2 " + two);
    }
}
