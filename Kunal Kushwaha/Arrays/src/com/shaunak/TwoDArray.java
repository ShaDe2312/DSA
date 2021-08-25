package com.shaunak;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr1 = new int[5][5]; //Valid
        int[][] arr2 = new int[3][]; //Valid
        arr2= new int[][]{
                {1, 23, 4},
                {1, 2, 3, 4, 5, 6, 7, 8},
                {1, 2, 3, 4, 5, 6}
        };
        for(int i=0; i<arr1.length; i++)
            for(int j=0 ; j<arr1[i].length;j++)
                arr1[i][j] = i+j; //setting values, you can take input from scanner also in this line.

//        for (int i=0; i< arr2.length; i++) //Valid, because arr2.length is 3
//            for(int j=0; j<arr2[i].length; j++) //NOT VALID because arr2[i].length is not defined.
//                arr2[i][j]= i+j;

        for (int i=0; i< arr2.length; i++) //Valid, because arr2.length is 3
            for(int j=0; j<3; j++) //NOT VALID because arr2[i].length is not defined.
                arr2[i][j]= i+j;



    }
}
