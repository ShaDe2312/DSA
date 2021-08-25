package com.loopsandconditionals;

import java.util.Scanner;

public class CountOccurrences {
    //Count the number of occurrences of a digit in a number.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        long num = input.nextInt();
        long unalteredNum=num;
        System.out.println("Enter the digit you want to search for");
        int digit = input.nextInt();

        if(digit==0 & num==0){
            System.out.println("0 occurs in 0, 1 time");
        }
        long lastDigit;
        int count=0;

        while(num != 0){
                lastDigit= num%10;
                if(lastDigit==digit){
                    count++;
                }
                num = num/10;
        }

        System.out.println("The digit " + digit + " occurs in the number" + unalteredNum + "," + count + " times");
    }
}
