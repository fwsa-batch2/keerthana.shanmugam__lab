package javabasics;

public class Calculator {
    public static void main(String[] args) {

        int sum = add(50,35);
        int sub = subract(89,69);
        int mul = multiply(10,5);
        int div = division(144,12);

        System.out.println("Addition = "+ sum);
        System.out.println("Subraction = "+ sub);
        System.out.println("Multiplication = "+ mul);
        System.out.println("Division = "+ div);
    }
    public static int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;

    }
    public static int subract(int num1, int num2) {
        int sub = num1 - num2;
        return sub;
    }
    public static int multiply(int num1, int num2) {
        int mul = num1 * num2;
        return mul;
    }
    public static int division(int num1, int num2) {
        int div = num1 / num2;
        return div;
    }
}
