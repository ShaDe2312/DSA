package com.loopsandconditionals;

import java.util.Scanner;

public class LCMNaive {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("ENter the two numbers.");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int iter=1;
        while(true){
            if(iter%num1==0 && iter%num2==0){
                System.out.println("LCM is: "+iter);
                break;
            }
            iter++;
        }

    }
}
