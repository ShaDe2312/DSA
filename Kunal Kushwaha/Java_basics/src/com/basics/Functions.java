package com.basics;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        System.out.println(sum());

    }

    static int sum(){
        //If a function is to be used in main, then it needs to be static function.
        Scanner inp= new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int i = a + b;
        return i;
    }
}
