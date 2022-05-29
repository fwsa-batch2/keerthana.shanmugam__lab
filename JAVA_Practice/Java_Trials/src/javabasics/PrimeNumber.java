package javabasics;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++){
            if(num % i == 0){
                sum++;
            }
        }
        if(sum==2){
            System.out.println("Your number is Prime");
        }
        else{
            System.out.println("Your number is Non-Prime");
        }
        scan.close();
    }
}
