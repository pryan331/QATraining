package org.java;
// in java OOp (Object Oriented Programing) is a paradigm that provides may concepts
//1>Inheritance
//2>Polymorphism
//3>Abstraction
//4>Encapsulation

// ->> Terms used in OOp
// - Coupling
//Cohesion
//Association
//Aggregation
//Composition

// levels of OOP
//Object
//Class
//inheritance
//polymorphism
//Abstraction
//Encapsulation

//What is Object?
// Any entity that has a state and a behaviour is known as object.
// table, chair, pen, keyboard, mice..etc.
// it can be physical or logical..

//An Object can be defined as an instance of a class.
//An object takes an address and space on memory.-- even when empty.
//EG. A CAT / DOG is an object, as it has STATE like color, breed, name etc.
// it also has behaviour- dog eats, walks, barks , bite
// Cat eats walks meoew scratch


// CLASS??
//Collection of objects is called a class.
// A class can also be defined as a map/ blueprint from which we can create
// individual objects. by NEW keyword.
// Class does not have an address or takes memory..
// A class can contain:
//field
// Methods
//Constructors
//Blocks of code
//nested class and interfaces

//Constructor
//in java a constructor is a special kind of method. it is used to initialize object of a class
// Constructors are called automatic when an object is created and is also
//responsible for setting initial values of the object's attributes or performing necessary
// setup. constructors have same name as the class they belong to and do not have a return value
// and are not void either.



public class OOPConcepts {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota","Camry",2023);
        Car car2 = new Car("Honda","CRV",2023);

        car1.print();
        System.out.println();
        car2.print();
    }
}
class Car{
    //instance of variables
    String Make;
    String Model;
    int Year;

    //constructor
    public Car(String Make,String Model,int Year){
        this.Make = Make;
        this.Model = Model;
        this.Year = Year;
    }
    //Method
    public void print(){
        System.out.println("Car Make: " + Make);
        System.out.println("Car Model: " + Model);
        System.out.println("Car year: " + Year);
    }
}

// Make Class of books, author, title, year published

