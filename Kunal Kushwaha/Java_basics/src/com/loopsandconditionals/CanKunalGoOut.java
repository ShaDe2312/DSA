package com.loopsandconditionals;

import java.util.Scanner;

public class CanKunalGoOut {

    //Kunal is allowed to go out with his friends
    // only on the even days of a given month. Write a program to check if he can go out in the month of August.

    public static void main(String[] args) {

        System.out.println("Enter the date (just the day's number):");
        Scanner inp = new Scanner(System.in);
        int date = inp.nextInt();

        if(date<1 || date>31){
            System.out.println("Invalid date");
        }

        else if(date%2==0)
            System.out.println("You may go, Kunal");

        else{
            System.out.println("Stay at home, Kunal");
        }

    }
}
