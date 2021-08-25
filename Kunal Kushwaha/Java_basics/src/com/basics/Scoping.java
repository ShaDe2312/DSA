package com.basics;

import java.util.Scanner;

public class Scoping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        {
            a=100;
            int c=200;
            System.out.println(c);
        }

        System.out.println(a); //Prints:100
        //NOTE: A's value got changed, because it is initialised outside
        //C cannot be used in main() because it's scope is limited to the block.
        //System.out.println(c); //Error
    }
}
