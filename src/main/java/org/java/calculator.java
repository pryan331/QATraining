package org.java;

public class calculator {
    public static void main(String[] args) {
        Add(2,2);
        Subtract(3,1);
        Multiply(5,10);
        Divide(10,5);
        Modulus(10,20);
    }
    public static int Add(int x, int y){
        int z = x + y;
        System.out.println("Adding " + x + "+" + y + " = " + z);
        return z;
    }
    public static int Subtract(int x, int y){
        int z = x - y;
        System.out.println("Subtracting " + x + "-" + y + " = " + z);
        return z;
    }
    public static int Multiply(int x, int y){
        int z = x * y;
        System.out.println("Multiplying " + x + "*" + y + " = " + z);
        return z;
    }
    public static int Divide(int x, int y){
        int z = x / y;
        System.out.println("Dividing " + x + "/" + y + " = " + z);
        return z;
    }
    public static int Modulus(int x, int y){
        int z = x % y;
        System.out.println("Modulus " + x + "%" + y + " = " + z);
        return z;
    }
}
