package com.shaunak;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = input.nextInt();

        System.out.println("The factors of " + num + " are:\n");

        for(int i=1; i<=(num/2 + 1); i++){
            if(num%i==0){
                System.out.print(i+ " ");
            }
        }
    }

}
