package org.java;
//OOP Concept
//Polymorphism??
//the word itself means many forms, in single words we can define poly
//as the ability to change one thing into diff forms or to behave diff.
//Compile time Poly...
//Runtime Poly...

//method overriding
//method overloading
public class MethodOverloading {
    public static void main(String[] args) {
        Converter converter = new Converter();
        double meters = 5;
        double feet = 10;
        double celsius = 25;
        double fahrenheit = 70;
        double centimeters = converter.convertToCentimeters(meters);
        System.out.println(meters + "meters is "+ centimeters + " centimeters");
        double metersFromFeet = converter.convertToMeters(feet);
        System.out.println(feet + "feet is: "+ metersFromFeet + "meters");
        double fahrenheitConverted = converter.convertToFahrenheit(celsius);
        System.out.println(celsius+ "celsius is: " +  fahrenheitConverted + "fahrenheit");
        double celsiusConverted = converter.convertToCelsius(fahrenheit);
        System.out.println(fahrenheit + "fahrenheit is: " + celsiusConverted + " celsius");
    }
}
class Converter{
    double convertToCentimeters(double meters){
        return meters * 100;
    }
    double convertToMeters(double feet){
        return feet * 0.3048;
    }
    double convertToFahrenheit(double celsius){
        return (celsius * 9/5) + 32;
    }
    double convertToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5/9;
    }
}