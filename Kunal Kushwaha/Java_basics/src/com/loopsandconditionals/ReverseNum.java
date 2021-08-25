package com.loopsandconditionals;

import java.util.Scanner;

public class ReverseNum {

    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner input = new Scanner(System.in);

        long num = input.nextInt();
        long rev=0;

        while(num>0){
            rev = rev + (num%10);
            rev *= 10;
            num /= 10;
        }

        System.out.println("The reverse is:\t" + rev/10);
    }
}
