package com.technews;

public class VariableTypes {
    public static void main(String[] args) {
//        String name = "Cleopatra"; // 'String' indicates the datatype of the variable will be a string
//        int age = 2016 + 69; //'int' indicates the datatype of the variable will be an integer (whole number)
//        double price = 1999.99;  // 'double' indicates that the datatype will be a decmil number
//        boolean truth = true; // 'boolean' indicates that the datype of the variable will be truthy or falsey
//        boolean falseness = !truth;
        int a = 19;
        double b = 19.99;
        String c = "hi";

        double sum = a + b; //calculated sum will return a double
        String concat = b + c; //caluclated concatonated value is a string

        System.out.println(sum);
        System.out.println(concat);

    }
} //public classes mean code can be used outside of particular class
 // in the () we define our arguments which in this particular class is an array of Strings
// Java is staticly typed meaning we need to define variables with their type before declaring them and we cannot change their types