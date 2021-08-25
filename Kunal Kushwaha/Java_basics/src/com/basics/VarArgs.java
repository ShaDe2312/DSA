package com.basics;

public class VarArgs {
    //Variable length arguments in Java
    public static void main(String[] args) {

        printNames("Shaunak", "Rugveda" , "BigFoot" , "Ravikant");
    }

    //Syntax: return type FunName(Datatype ...variableName){}
    static void printNames(String ...names){
        System.out.print("Hello, My dear ");
        for (String name:names) {
            System.out.print(name + ", ");
        }
        //Variable name arguments should be last in the function.
        //If you overload varargs, you cannot keep the function call empty
        //because Java wouldn't know which function to call among the two.
    }
}
