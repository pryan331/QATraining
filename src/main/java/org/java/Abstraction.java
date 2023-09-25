package org.java;
//OOP in Java
// A class which is declared with the abstract keyword is known as abstract class in Java.
// abstract class can have abstract and non-abstract methods.
public class Abstraction extends Cars {
    void start(){
        System.out.println("Starting car.");
    }
    public static void main(String[] args) {
        Cars c = new Abstraction();
        c.start();
        Shape sphere = new sphere();
        Shape rectangle = new Rectangle();
        sphere.draw();
        rectangle.draw();
    }
}
abstract class Cars{
    abstract void start();
}
abstract class Shape{
    abstract void draw();
}
class sphere extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing a sphere");
    }
}
class Rectangle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing a rectangle");
    }
}