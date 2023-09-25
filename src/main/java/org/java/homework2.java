package org.java;
import java.util.Arrays;
import java.util.Scanner;
public class homework2 {
    public static void main(String[] args) {
        //evenOdd(2);
        //evenOdd(3);
        //primeNumber();
        //factorial(4);
        //fibonacci(20);
        //areaCircumference();
        //squareRoot();
        //randomNum(2,10);
        //greatestCD(30,100);
        //palindrome("car");
        //palindrome("racecar");
        //wordCount("The lazy bunny tried to jump over the lazy stream.", "lazy");
        //reverseString("alarm");
        //removeDupChar("alarm", "a");
        //capitalize("The lazy goat ate all of the grass.");
        //int [] arr = {14,32,63,5,27};
        //maxMin(arr);
        //getSortedArray();
        //secondLargest();
        //int [] arr1 = {2,3,4,5,1};
        //int [] arr2 = {7,8,9,10,6};
        //mergeArray(arr1, arr2);
        oddArray();
    }
    //1. Write a program to check if a given number is even or odd.
    public static void evenOdd(int num){
        if(num % 2 == 0){
            System.out.println("Number " + num + " is even.");
        } else {
            System.out.println("Number " + num + " is odd.");
        }
    }
    //2. Create a program that prints the first 50 prime numbers.
    public static void primeNumber(){
        int n;
        int status = 1;
        int num = 3;
        //For capturing the value of n
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        //The entered value is stored in the var n
        n = scanner.nextInt();
        if (n >= 1){
            System.out.println("First "+n+" prime numbers are:");
            //2 is a known prime number
            System.out.println(2);
        }

        for (int i = 2 ; i <= n; i++){
            for ( int j = 2 ; j <= Math.sqrt(num) ; j++ ){
                if (num % j == 0 ){
                    status = 0;
                    break;
                }
            }
            if ( status != 0 ){
                System.out.println(num);
                i++;
            }
            status = 1;
            num++;
        }
    }

    //3. Implement a program to find the factorial of a given number using a loop.
    public static void factorial(int num){
        int fact = 1;
        for(int i = 1; i <= num; i++){
                fact = fact * i;
                System.out.println(fact);
        }
    }

    //4. Write a Java program to print the Fibonacci series up to 20.
    public static void fibonacci(int n){
//        int num1 = 0;
//        int num2 = 1;
//        int counter = 0;
//
//        while (counter < n) {
//            System.out.print(num1 + " ");
//
//            int num3 = num2 + num1;
//            num1 = num2;
//            num2 = num3;
//            counter = counter + 1;
//        }
    }

    //Math Methods
    // 1. Write a program to calculate the area and circumference of a circle given its radius.
    public static void areaCircumference(){
        double radius, area, circumference;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Radius of Circle:");
        radius = in.nextDouble();
        // Calculate area and circumference of circle
        area = Math.PI * radius * radius;
        circumference = 2 * Math.PI * radius;

        System.out.println("Area of Circle : " + area);
        System.out.println("Circumference of Circle : " + circumference);;
    }

    // 2. Implement a program that calculates the square root of a number using the
    // Math.sqrt() method.
    public static void squareRoot(){
        int sqrRoot;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        sqrRoot = scanner.nextInt();
        System.out.println(Math.sqrt(sqrRoot));
    }

    // 3. Create a program that generates and prints a random number between a given range.
    public static void randomNum(int num1, int num2){
        int min = num1;
        int max = num2;
        int randomNumber = (int) (Math.random() * num2);
        boolean randNum = (randomNumber >= num1) && (randomNumber <= num2);
        if(randNum){
            System.out.println("Range is between " + min + " and " + max + " and random number is " + randomNumber);
        } else {
            System.out.println("Number " + randomNumber + " not in range.");
        }
    }

    // 4. Write a Java program to find the greatest common divisor (GCD) of two numbers.
    public static void greatestCD(int num1, int num2){
        int gcd = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println(gcd);
    }

    //String Methods
    // 1. Write a program that checks if a given string is a palindrome.
    public static void palindrome(String str){
        String reverseString = "";
        boolean answer = false;

        for (int i = str.length() - 1; i >= 0; i--) {
            reverseString = reverseString + str.charAt(i);
        }

        if (str.equals(reverseString)) {
            answer = true;
        }
        System.out.println(answer);
    }

    // 2. Create a program to count the occurrences of a specific word in a given sentence.
    public static void wordCount(String str, String word){
        String a[] = str.split(" ");

        int count = 0;
        for (int i = 0; i < a.length; i++)
        {
            if (word.equals(a[i]))
                count++;
        }
        System.out.println(count);
    }

    // 3. Implement a program to reverse a given string without using built-in string reversal methods.
    public static void reverseString(String str){
        String reverse = "";
        for(int i = str.length() - 1; i >= 0; i--){
            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);
    }

    // 4. Write a Java program to remove all duplicate characters from a string.
    public static void removeDupChar(String str, String x){
        String strNew = str.replace(x, "");
        System.out.println(strNew);
    }

    // 5. Create a program that capitalizes the first letter of each word in a sentence.
    public static void capitalize(String str){
        String a[] = str.split(" ");
        String newWord = "";
        for (int i = 0; i < a.length; i++){
            newWord = a[i].substring(0,1).toUpperCase() + a[i].substring(1,a[i].length());
            System.out.print(newWord + " ");
        }
    }

    // Array Methods
    // 1. Write a program to find the maximum and minimum values in an array of integers.
    public static void maxMin(int[] nums){
        int max = nums[0];
        int min = nums[0];
        int len = nums.length;
        for (int i = 1; i < len - 1; i = i + 2) {
            if (i + 1 > len) {
                if (nums[i] > max) {
                    max = nums[i];
                }
                if (nums[i] < min) {
                    min = nums[i];
                }
            }
            if (nums[i] > nums[i + 1]) {
                if (nums[i] > max) {
                    max = nums[i];
                }
                if (nums[i + 1] < min) {
                    min = nums[i + 1];
                }
            }
            if (nums[i] < nums[i + 1]) {
                if (nums[i] < min) {
                    min = nums[i];
                }
                if (nums[i + 1] > max) {
                    max = nums[i + 1];
                }
            }
        }
        System.out.println(" Max value for the array = " + max);
        System.out.println(" Min value for the array = " + min);
    }

    // 2. Implement a program to sort an array of integers.--{1,4,3,5,2}={1,2,3,4,5}
    public static void getSortedArray(){
        int [] arr = {1,4,3,5,2};
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ",");
        }
    }

    // 3. Create a program that finds the second largest element in an array of integers.
    public static void secondLargest(){
        int temp;
        int array[] = {12,22,25,59,88,45};

        for(int i = 0; i < array.length; i++ ){
            for(int j = i + 1; j < array.length; j++){

                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("The second largest number is: " + array[array.length-2]);
    }

    // 4. Write a Java program to merge two sorted arrays into a single sorted array.
    private static void mergeArray(int[] arrayA, int[] arrayB) {
        int[] mergedArray = new int[arrayA.length + arrayB.length];
        int i=0, j=0, k=0;

        while (i < arrayA.length && j < arrayB.length) {
            if (arrayA[i] < arrayB[j]) {
                mergedArray[k] = arrayA[i];
                i++;
                k++;
            } else {
                mergedArray[k] = arrayB[j];
                j++;
                k++;
            }
        }

        while (i < arrayA.length) {
            mergedArray[k] = arrayA[i];
            i++;
            k++;
        }

        while (j < arrayB.length) {
            mergedArray[k] = arrayB[j];
            j++;
            k++;
        }
        Arrays.sort(arrayA);
        System.out.println("Array A : "+Arrays.toString(arrayA));
        Arrays.sort(arrayB);
        System.out.println("Array B : "+Arrays.toString(arrayB));
        Arrays.sort(mergedArray);
        System.out.println(Arrays.toString(mergedArray));
    }

    // 5. Implement a program that removes all even numbers from an array of integers and returns a new array.
    public static void oddArray(){
        int countOdd = 0;
        int newArray[] = null;

        int originalArray[] = {8, 7 , 66, 14, 99, 20, 1, 42};

        for (int i : originalArray){
            if (!(i % 2 == 0))
                countOdd++;
        }

        newArray = new int[countOdd];

        int i = 0;
        for (int num : originalArray) {
            if (!(num % 2 == 0)) {
                newArray[i++] = num;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
