package org.java;
// exception handling in java is mechanism to handle the runtime errors so that the normal
//flow of tha application can be maintained.
//java can throw an exception is program is disrupted during runtime.

//checked and unchecked exceptions and Error.

//Throwable
//Exception     // Error
//IOException
//SQLException
//ClassNotFoundException
//RuntimeException
//ArithmeticException
//NullPointerException
//NumberFormatException
//IndexOutOfBoundException
//ArrayIndexOutOfBoundException
//StringIndexOutOfBoundException

// Error
//StackOverflow Error
//VirtualMachineError
//OutOfMemoryError

//Checked Exceptions?
// The Class that directly inherit the Throwable class Except runtimeException and Error are known as
//Checked exception.Exception
//  //IOException
//  //SQLException
//  //ClassNotFoundException

//Unchecked Exceptions??
//the Classes that inherit the runtimeException are known as unchecked exceptions..
// //ArithmeticException
//    //NullPointerException
//    //NumberFormatException
//    //IndexOutOfBoundException
//        //ArrayIndexOutOfBoundException
//        //StringIndexOutOfBoundException

//Keywords to remember:
//Try
//Catch
//Finally
//Throw
//Throws

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHanling {

    public static void Math() throws ArithmeticException{
        try {
            int result = 10/0;
            System.out.println(result);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } finally {
            int c = 10;
            int d = 2;
            System.out.println("Dividing 10 by 2 " + c / d);
        }
    }

    public static void stringMethod() throws NullPointerException{
        try {
            String str = null;
            int length = str.length();
            System.out.println(length);
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    public static void array() throws ArrayIndexOutOfBoundsException{
        try {
            int[] arr = {1,2,3};
            int value = arr[5];
            System.out.println(value);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }

    public static void number() throws NumberFormatException{
        try {
            String text = "abc";
            int num = Integer.parseInt(text);
            System.out.println(num);
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }

    public static void cal(){
        int a = 10;
        int b = 20;
        System.out.println(a+b);
    }




    public static void main(String[] args) {
        Math();
        stringMethod();
        array();
        number();
        cal();
    }
}