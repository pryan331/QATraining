package org.java;
//Java Array
//Array is an object which contains elements of the same data type
//the elements of array is stored in a continuous memory location
//Array is the data structure where we store similar elements
//Array is java is index based, the first element of an array is stored at 0 and second at 1.

//advantages
//Random access of elements
//code optimization

//disadvantage
//Size limit - cannot add or remove an element

//Types
//Single Dimensional
//Multi Dimensional

//says to declare an array
//datatype [] name;
//dataType [] name;
//datatype name [];
public class Array {
    public static void main(String[] args) {
        //arrayExample();
        Array2();
        //Array3();
        //ArrayForEach();
        //forEach2();
        //print();
        //int[] a = {1,2,3,4,5};
        //a(a);
        //char3("hello");
        //sumValues(2,3);
        //sumValues(3,3);
        //int[] arr = {1, 2, 3};
        //int[] arrB = {1, 2, 3, 4, 5, 6};
        //intsArray(arr);
        //int[] arr = {1,2,3};
        //reverseArray(arr);
        //int a = 10;
        //double dd = 3.14;
        //getDataType(a);
        //getDataType(dd);
        //arrayReverse();
    }

    public static void arrayExample() {
        int a[] = new int[5]; //constructor key word called new
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        for (int j : a) { //Advanced Lambda way (ambiguous)
            System.out.print(j + " ");
        }

    }

    public static void Array2() {
        int a[] = {10, 20, 30, 40, 50};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void Array3() {
        int a[] = {10, 20, 30, 40, 50};
        int i = 0;
        while (i < a.length) {
            System.out.println(a[i] + " ");
            i++;
        }
    }

    public static void ArrayForEach() {
        int[] a = {10, 20, 30, 40, 50};
        for (int i : a) {
            System.out.println("element " + i);
        }
    }

    public static void forEach2() {
        String[] names = {"Brian", "Max", "Patrick", "Kim"};
        for (String n : names) {
            System.out.println(n);
        }
    }

    static int[] get() {
        return new int[]{10, 11, 12, 13, 14};
    }

    public static void print() {
        int arr[] = get();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void a(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    //Given a string, we'll say that the front is 3 chars of the string.
    // if the string length is less than 3,
    // the front is whatever is there. Return a new string which is 3 copies of front.

    public static void char3(String str) {
        String front;
        if (str.length() >= 3) {
            front = str.substring(0, 3);
        } else {
            front = str;
        }
        System.out.println(front + front + front);
    }

    //Given two int values, return their sum.
    // Unless the two values are the same, then return double their sum.
    public static void sumValues(int a, int b) {
        if (a != b) {
            System.out.println(a + b);
        } else {
            System.out.println(a * b);
        }
    }

    // Given an array of ints, return true if 6 appears as either the first
    //or last element in the array. The array will be length 1 or more.
    public static void intsArray(int arr[]) {
        System.out.println((arr[0] == 6 || arr[arr.length - 1] == 6));
    }

    //Given an array of ints length 3, return a new array with the elements in
    //reverse order so (1,2,3) becomes (3,2,1)
    public static int[] reverseArray(int[] nums){
        int[] reversed = new int[3];
        reversed[0] = nums[2];
        reversed[1] = nums[1];
        reversed[2] = nums[0];
        return reversed;
    }

    public static void arrayReverse(){
        int[] array= {1,2,3};
        int[] reversedArray = reverseArray(array);

        for (int nums : reversedArray){
            System.out.print(nums + " ");
        }
    }

    public static void getDataType(Object j){
        String str = "hello World";
        int arr[] ={1,2,3,4,5};
        System.out.println("type of str " + str.getClass().getName());

        if (j instanceof Integer){
            System.out.println("its int");
        } else if (j instanceof Double){
            System.out.println("this is double");
        } else if (j instanceof String) {
            System.out.println("this is a string");
        }
    }
}
