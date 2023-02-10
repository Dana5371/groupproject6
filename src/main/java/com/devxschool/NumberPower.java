package main.java.com.devxschool;

import java.util.Scanner;

public class NumberPower {

    public static void main(String[] args) {
        /**
         * User will provide two numbers, write a program that finds the result of one number
         * raised to the power of another
         *
         * Example output:
         * Enter the base number: 2
         * Enter the power number: 3
         * Result: 8
         *
         */

        Scanner console = new Scanner(System.in);
        int base;
        int power;

        // TODO WRITE CODE HERE
        base = console.nextInt();
        power = console.nextInt();
        System.out.println(countPowerOfNums(base, power));

    }

    public static int countPowerOfNums(int base, int power) {
        // TODO IMPLEMENT METHOD
        int result = 1;
        while (power > 0){
            result *= base;
            power--;
        }
        return result;
    }
}
