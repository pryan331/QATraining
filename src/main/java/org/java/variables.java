package org.java;

public class variables {
    //there are three types of variables in java
    //1>local variables - a variable declared in body of a method/function(can use only within that method)
    //2> Instance variable - A variable declared inside the class but outside the method and not static
    //3>Static Variable - A Variable declared as keyword 'static. can not be local(body of method)
    //global -usable in the class itself
    static int a = 100; //static variable
    int abc = 120; //global variable non-static

    public void methodA() {
        int b = 100; //local variable
        System.out.println(a + b);
        System.out.println(abc);
        System.out.println(a);
    }

    public static void main(String[] args) {
        int ab = 100; // instance variable
        System.out.println(a);
        //System.out.println(abc);
    }
}
