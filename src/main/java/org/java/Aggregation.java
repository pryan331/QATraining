package org.java;

public class Aggregation {
    public static void main(String[] args) {
        Circle c = new Circle();
        double result = c.area(5);
        System.out.println(result);
    }
}
class Operation{
    int square(int a){
        return a*a;
    }
}
class Circle{
    Operation o;
    double pi = 3.14;

    double area(int radius){
        o = new Operation();
        int rsquare = o.square(radius);
        return pi*rsquare;
    }
}

//Create a class Address with city state country.-- just create class and constructor.
//create method as employee id name address(Coming from Address Class) .
// pass Address address as a prop to Employee class as argument.
//public Employee(int id, String name, Address address){}
//print at least 1 employee with all the details.