package org.java;

//OOP Concept of Inheritance
//What is inheritance??
// inheritance in java is a system in which one object gets all the properties and
//behaviors of the parent.
//you can create multiple classes upon existing classes.
// IS-A relation -- inheritance
//Has-A relation -- AGGREGATION

public class Inheritance {
    public static void main(String[] args) {

        //vehicle.start();

        Plane plane = new Plane();
        plane.start();

        Boat boat = new Boat();
        boat.start();

        Developer hr = new Developer();
        int totalsalary = hr.BaseSalary + hr.bonus + hr.salary;
        System.out.println(totalsalary);
    }
}
class Vehicle{
    public void start(){
        System.out.println("the machine is started.");
    }
}
class Plane extends Vehicle{
    Vehicle vehicle = new Vehicle();
    public void start(){
        System.out.println("Plane engine starting");
    }
}

class Boat extends Vehicle{
    Vehicle vehicle = new Vehicle();
    public void start(){
        System.out.println("Boat engine starting");
    }
}
class Employee{
    int BaseSalary = 100000;

}
class HR extends Employee{
    int bonus = 5000;
}
class Developer extends HR {
    int salary = 100000;
}
class QA extends HR{
    int salary = 90000;
}
class ManualQA extends QA{
    int salary = 50000;
}