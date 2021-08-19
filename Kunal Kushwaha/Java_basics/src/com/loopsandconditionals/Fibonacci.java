package com.loopsandconditionals;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program to find the Nth Fibonacci number. Please enter n.");
        int n= input.nextInt();

        int a=0;
        int b=1;

        for(int i=2; i<n; i++){
            int temp = b;
            b= b + a;
            a=temp;
        }

        System.out.println("Nth fibonacci number is:" + b);
    }

}
