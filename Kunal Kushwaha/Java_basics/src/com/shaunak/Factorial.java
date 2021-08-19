package com.shaunak;


import java.util.Scanner;

public class Factorial{

    public static void main(String[] args) {
        System.out.println("Enter a number:\n");
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int inputNum=num;
        long fact=1;

        while(num != 0){
            fact = fact * num;
            num--;
        }


        System.out.println("Factorial of "+ inputNum +" is "+ fact);
    }


}
