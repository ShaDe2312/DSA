package com.basics;

public class Shadowing {
    static int x= 100;

    public static void main(String[] args) {
        System.out.println(x); //prints 100

        int x; //Declaration of variable

        x=200; //Variable at line 4 is Shadowed here
        //Note that scope will begin at initialisation and not declaration
        System.out.println(x);//200
        fun();
    }

    static void fun(){
        System.out.println("Function:\t" + x);
    }
}
