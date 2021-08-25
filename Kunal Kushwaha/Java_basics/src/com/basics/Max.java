package com.basics;

import java.util.Scanner;

public class Max {

    public static void main(String[] args) {
        //Take integer inputs till the user enters 0 and print the largest number from all.
        Scanner input = new Scanner(System.in);
        System.out.println("Keep entering numbers, enter 0 to terminate:");
        int max= Integer.MIN_VALUE; //equivalent to INT_MIN in C++
        int temp=input.nextInt();

        while(temp != 0){
            if(temp>max) {
                max=temp;
            }
            temp=input.nextInt();
        }

        System.out.println("The maximum number is:\t"+max);
    }


}
