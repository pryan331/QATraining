package org.java;
// in Java Wrapper classes are used to convert primitive data type into objects and vice versa
//so that it could be used in the Java OOP.

//in example class Integer is used to wrap a primitive int and then
//unwrapped back into primitive

public class WrapperInJava {
    public static void main(String[] args) {
        int primitiveInt = 42;
        Integer wrappedInt = Integer.valueOf(primitiveInt);
        int unwrappedInt = wrappedInt.intValue();
        String i = wrappedInt.toString();

        System.out.println("Primitive int: "+ primitiveInt);
        System.out.println("Wrapped Int: "+ wrappedInt);
        System.out.println("UnWrapped Int: "+ unwrappedInt);
        System.out.println("this is a string of int: "+wrappedInt.toString());
        System.out.println(wrappedInt.getClass().getName());
        System.out.println();
    }
}
