package com.shaunak;

import java.util.Arrays;

public class Basics {
    public static void main(String[] args) {
        //SYNTAX: datatype[] identifier = new datatype[size].

        int[] rollNos = new int[10];
        //This works internally as:
        int[] rollNos2; //A new reference variable is created in the stack. Currently it points nowhere (null).
        rollNos2 = new int[5]; //Variable now points to an array in heap with size 5.
        rollNos2[0]=1;
        /*
        The above snippet is similar to
        int* ptr; (is in stack)
        *ptr = new int[5];  (is in heap) in C++
        */
        /*Unlike c++, arrays are NOT contiguous in Java.
            (i)Array objects are in the heap memory, and
            (ii) Heap objects are not contiguous in Java.
         Hence, arrays may NOT be contiguous in Java, and it depends on JVM.
         */

        for (int i : rollNos) {
            System.out.print(rollNos[i] + " ");
        }
        //Thus, integer Arrays are initialised to 0 in java by default, String arrays are null by default

        for (int i=0; i<10; i++){
            rollNos[i]=i;
        }
        System.out.println();
        //Another way of printing is:
        System.out.println(Arrays.toString(rollNos));

        String[] arr = new String[3];
        arr[0]="Shaunak";
        arr[1]="Sudhir";
        arr[2]="Deshpande";

        //Internally, arr is a reference variable in stack, which points to THREE REFERENCE VARIABLES
        // in the heap, and the reference variables map to "Shaunak", "Sudhir", and "Deshpande".
        //This is because String is a NON-PRIMITIVE datatype. https://www.tutorialspoint.com/assets/questions/media/26215/array_myarray.jpg
        System.out.println("\nPrinting using toString()");
        System.out.println(Arrays.toString(arr));

        //2D arrays
        int[][] Arr = new int[3][]; //Number of rows REQUIRED, Columns, not required

        int [][] Arr2 = {  //Initialisation
                {1,2,3,4,5,6},
                {7,8,9},
                {10}
        };

        System.out.println("\n 2D array:");
        for (int[] array : Arr2) {
            System.out.println(Arrays.toString(array));
        }

    }
}
