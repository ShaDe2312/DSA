package com.basics;

import java.util.Locale;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("Enter a fruit");
        Scanner input = new Scanner(System.in);
        String fruit = input.next().toLowerCase(Locale.ROOT);
        System.out.println("How much do you love this fruit (1-10)");
        int appreciationValue = input.nextInt();
        //You can use C++ Switch syntax in Java, else you can use the new switch syntax.

        //New syntax

        switch (fruit){
            case "mango" -> {
                switch (appreciationValue){
                    case 1,2,3,4,5:
                        System.out.println("You don't like it that much it seems. You should totally try the mangoes from my farm");
                    case 6,7:
                        System.out.println("Yupp mangoes are pretty amazing");

                    case 8,9:
                        System.out.println("You love them almost as much as me");
                    case 10:
                        System.out.println("Ahh! A fellow mango appreciator");
                    default:
                        if(appreciationValue>10)
                        {
                            System.out.println("Ahh! A fellow mango appreciator");
                        }
                        else{
                            System.out.println("It seems that you don't like mangoes. You should totally try the mangoes from my farm");
                        }
                }
            }
            case "apple" -> System.out.println("Queen of all fruits");
            case "guava" -> System.out.println("Cool fruit I love it.");
            default -> System.out.println("Never heard about this one before");
        }

    }
}
