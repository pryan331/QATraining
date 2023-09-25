package org.java;
//java inbuilt methods for math and Strings


import java.sql.SQLOutput;

public class MathStringMethods {
    //Math methods
    public static void main(String[] args) {
        int a = 10;
        double b = 10.02;
        float c = -20.95f;

        System.out.println(Math.abs(c)); // turns to positive
        System.out.println(Math.floor(b)); //will give a whole number
        System.out.println(Math.max(10,30)); //30
        System.out.println(Math.min(-1,40));// -1
        System.out.println(Math.sqrt(25)); //5
        System.out.println(Math.PI); //3.14
        System.out.println(Math.pow(10,2)); // 10 * 10
        System.out.println(Math.nextUp(20)); // next floating
        System.out.println("Next Down is: " + (int) Math.nextDown(20)); // floating before
        //System.out.println(Math.absExact(a));
        System.out.println(Math.addExact(10,2));

//        Random random = new Random();
//        int randomNumber = random.nextInt(10);
        int randomNumber = (int) (Math.random() * 21);
        System.out.println("Random Number is " + randomNumber);

        String str = "Hello";
        char charAtIndex = str.charAt(1);
        System.out.println(charAtIndex + " is the character at index 1");
        System.out.println(str.length());
        String format = String.format("value %d", 42);
        System.out.println(format);
        String sub = str.substring(2,4);
        System.out.println(sub);
        String range = str.substring(3,4);
        System.out.println(range);
        boolean contains = str.contains("World");
        System.out.println(contains);
        String join = String.join("|","a","b","c");
        System.out.println(join);
        boolean isEqual = str.equals("Hello");
        System.out.println(isEqual);
        boolean isEmpty = str.isEmpty();
        System.out.println(isEmpty);
        String concat = str.concat(" world"); //modifies string as a single variable
        System.out.println(concat);
        System.out.println("Hello" + " world"); // two variables more memory used
        String replace = str.replace("Hello","world");
        System.out.println(replace);
        String[] split = str.split("e");
        for(int i = 0; i < split.length; i++){
            System.out.print(split[i] + " ");
        }

        int indexOfChar = str.indexOf("l"); //gives first index
        System.out.println(indexOfChar);
        String upper = str.toUpperCase();
        System.out.println(upper);
        String lower = str.toLowerCase();
        System.out.println(lower);
        String trim = "this     space        ".trim(); //Saves spaces
        System.out.println(trim);
        String value = String.valueOf(1999);//given int but return string
        System.out.println(value);

        boolean ignore = str.equalsIgnoreCase("HELLO");
        System.out.println(ignore);


        //greeting("bob");
        //rotated("Hello");
        //append("abc", "cat");
        //mArrays();
        //threeDArray();
        int[] arr = {1,2,3,30,44,-90,70,-800,56,66};
        largestNumber(arr);

    }
    //Given a string name, e.g. "Bob, return a greeting of the form "Hello Bob".
    public static void greeting(String a){
        String hello = "Hello ";
        String name = "Patrick";
        System.out.println(hello.concat(name));
    }

    //Given a string, return a rotated left 2" version where the first 2 chars are saved to
    // the end. The string length will be at least 2.
    public static void rotated(String str){
        if(str.length() < 3){
            System.out.println(str);
        }
        String firstTwo = str.substring(0,2);
        String remaining = str.substring(2);
        System.out.println(remaining+firstTwo);
    }

    //Given two strings, append together (known as concatenation) and return the result.
    //However, if the concatenation creates a double char,
    // then omit one of the chars, so "abc and "cat" yields "abcat".
    public static void append(String str1, String str2){
        if (str1.length() ==0 || str2.length() ==0){
            System.out.println(str1+str2);
        }
        if ((str1.charAt(str1.length()-1) == str2.charAt(0))){
            System.out.println(str1+ str2.substring(1));
        }
    }

    //Multi dimensional Arrays
    public static void mArrays(){
        // Multi dimensional Array
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix.length; col++){
                System.out.print(matrix[row][col] + " ");
            } System.out.println();
        }
    }

    public static void threeDArray(){
        int [][] a = {{1,1,1},
                     {2,2,2},
                     {3,3,3}};

        int [][] b = {{1,1,1},
                     {2,2,2},
                     {3,3,3}};

        //((1+1)+(1+2)+(1+3))
        //((2+1)+(2+2)+(2+3))
        //((3+1)+(3+2)+(3+3))

        int [][] c = new int[3][3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                for(int k = 0; k < 3; k++){
                    c[i][j] += a[i][k] + b[k][j];
                }
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    // print the largest number from the given array
    public static void largestNumber(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("largest number is : " + max);
    }
}

//Fibonacci sequence
//1+2=3
//3+3=6
//3+6=9
//6+9=15
//"MOM" "RADAR" "TACO CAT" -- spell it left to right at right to left


