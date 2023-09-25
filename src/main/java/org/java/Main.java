package org.java;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello JAVA");

        //Datatype Variable Name Assignment Value
        String hello = "hello Patrick";
        System.out.println(hello);
        String learn = "I am learning java";

        System.out.println(hello + " " + learn);

        //Basic math operations
        // add 2 numbers
        // sub 2 numbs
        // multi 2 num
        // div 2 num
        // square num

        int a = 2;
        int b = 2;
        int c = 22;
        int d = 7;
        double pi = Math.PI;
        int e = 10;
        char f = 'a';
        String g = "this is a string";
        byte h = 127;
        short i = 32767;
        long j = 2^63;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a*a);
        System.out.println(a%b);

        // find me the value of Pi
        System.out.println(pi);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
        System.out.println(diff(17));
        System.out.println(diff(5));
        System.out.println(diff(21));
        System.out.println(temp(110, -1));
        System.out.println(temp(-1, 110));
        System.out.println(temp(4, 110));
    }
//Given an int n, return the absolute difference between n and 21,
// except return double the absolute difference if n is over 21.

    public static int diff(int n) {
        if (n<=21){
            return 21-n;
        }
        else if (n>21){
            return ((n-21)*2);
        }
        else {
            return 0;
        }
    }

    //Given two temperatures, return true if one is less than 0 and
    //the other is greater than 100.
    public static boolean temp(int temp1, int temp2) {
        if (temp1<0 && temp2>100 || temp2<0 && temp1>100){
            return true;
        }
        else {
            return false;
        }
    }
}


//in java a package is a way to organize related classes,interfaces and sub packages.
// NAME SPACE - package provides namespace for classes, which means classes with same name can
// exist in diff packages without conflict.
// ACCESS CONTROL- java's access control determines the visibility of classes and members within
// and outside the package

//IMPORT STATEMENTS - to use classes from other packages in your code, you need to import them
// using import statement. by packagename.classname

//what is class in JAVA?

//in java a class is blueprint or a template that defines the structure and behaviour of objects.
//it serves as a fundamental building block in OOP allowing to create instances(Objects) that share
//common attributes and behaviours(methods/functions).
//ACCESS MODIFIERS - in java access modifiers are the keywords used to control the visibility or the access
// of a class,method,field or other class members.

//Public - Members with public access modifier are accessible from anywhere both within the class and outside the class
// and also in different packages.

//Protected - members with the protected access modifier are accessible within the same class,same
// package and by subclass.
// Default - if no access modifier is specified, the member has the default access level. that means it is
//package-private. only visible in same class, same package.

// Private - members with private access modifier are accessible only within the same class.
// DATA TYPES IN JAVA
// Primitive Data Types
// byte -8 bit -128 to 127
// short - 16 bit - small number ranging from 32.768 to 32767
// int - 32 bit -- whole number -2^31 to 2^31
// long - 64 -2^63 to 2^63
// float - 32 decimal numbers range same as int but 3.14f always define float number with f at the end
// double - 64 bit limit 3.141592653589793
// char - "a" , '1' , '1'
// boolean - either true or false
// String - this could be a sentence

// Reference data types
// classes - user defined
// Arrays -- collection of elements
// interface - Defines a contract the class can implement
// ENUM - A special datatype that represents a group of constants.

// JAVA OPERATORS
//Arithmetic operators
    //+ - * / %
// Assignment operators
    // = += -= /= %= *=
// increment and decrement operators
    // ++ --
//Comparison Operators
    // == != < > <= >=
//Logical Operators
    // && || !
//ternary operators
    //condition ? value_if_true : value_if_false

//Compile time and run time
//Runtime?
//class>ClassLoader>ByteCode>Interpreter>runtime>hardware

//Compile time?
//JavaCode > compiler > bytecode