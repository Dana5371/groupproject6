package main.java.com.devxschool;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        /**
         * In math, the factorial of a positive integer n, denoted by n! is the product of all integers less than or equal to n.
         * Calculate factorial and output result to the console.
         * ex: 5! = 5 * 4 * 3 * 2 * 1
         * Enter a number:
         * 5
         * Factorial result: 120
         */

        // TODO write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        calculate(num);

    }

    public static void calculate(long number) {
        // TODO IMPLEMENT METHOD
        long user_number = number;
        long num = 1;
        while (user_number > 0) {
            num *= user_number;
            user_number--;
        }
        System.out.println("Factorial: " + num);
    }
}
