package org.java;

public class OverloadingExample2 {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();
        double circleArea = calculator.calculateArea(3);
        System.out.println("area of a circle is "+ circleArea);
        double rectangleArea = calculator.calculateArea(5,8);
        System.out.println("Area of a rectangle is "+rectangleArea);
        double triangleArea = calculator.calculateArea(6,10, true);
        System.out.println("Area of a triangle is "+triangleArea);
        double invalid = calculator.calculateArea(0,0,false);
        if(invalid == 0){
            System.out.println("cannot calculate the area");
        }
    }
}
class AreaCalculator{
    double calculateArea(double radius){
        double radiusSquare = radius * radius;
        return Math.PI * radiusSquare;
    }
    double calculateArea(double length, double width){
        return length * width;
    }

    double calculateArea(double base, double height, boolean isTriangle){
        if(isTriangle){
            return 0.5 * base * height;
        } else {
            return 0;
        }
    }
}