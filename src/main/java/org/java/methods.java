package org.java;

public class methods {
    public static void main(String[] args){
        MethodA();
        MethodAA(2,2);
        MethodB();
        MethodBB(2,4);
        MethodC();
        MethodD();
        MethodE(3,4);
        MethodF(5,6);
        MethodG(10,10);

        //Typecasting
        int q = 10;
        float z = q;
        double x = z;
        System.out.println(z);
        System.out.println(x);
    }
    // types of methods
    //1> method with arguments
    //2> method without arguments
    //3> method with arguments void / non-void
    //4> method without arguments void / non-void
    public static void MethodA() {

        System.out.println("this is a void method without arguments");
    }

    public static void MethodAA(int a , int b){

        System.out.println("this is a void method with arguments");
    }

    public static int MethodB(){
        int a = 10;
        System.out.println("this is method with return type int an no argument" + a);
        return a;
    }

    public static int MethodBB(int a, int b){
        int c = a+b;
        System.out.println("this is method with return int with argument" + c);
        return c;
    }
    public static  boolean MethodC(){
        System.out.println(true);
        return true;
    }

    public static String MethodD(){
        String a = "this is a string method";
        System.out.println(a);
        return a;
    }

    public static void MethodE(int a, int b){
        int c = a+b;
        System.out.println("this is method with return int with argument" + c);
    }

    public static void MethodF(int a, int b){
        int c = a*b;
        System.out.println("this is method with return int with argument" + c);
    }

    public static boolean MethodG(int a, int b){
        boolean c = a < b;
        boolean d = a > b;
        boolean e = a == b;
        boolean f = a != b;
        boolean g = a <= b;
        boolean h = a >= b;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        return c;
    }

    // create a single calculator in java
    // + - * /  % square square root comparing numbers

    // check if it's a leap year every 4 years - divisible by 4
    // check if it is a prime number or not -divisible by itself
    // check if it is an even number - divisible by 2
    // check if it is an odd number - not divisible by 2
}
