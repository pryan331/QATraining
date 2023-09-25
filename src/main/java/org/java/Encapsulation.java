package org.java;
//oop Concept
//Encapsulation

//What is Encapsulation?
//Encapsulation in java is a process of wrapping java code or data into another bigger
// unit or a single unit. as the name suggest it like a capsule. one capsule could have many diff
//medicines into it.

//getter and setter methods is used in encapsulation
//by these getter and setter methods we can make a class read-only or write only class.
//we can have control over the data flow by this. by skipping either getter or setter method
//this is a way to hide data as another class will no longer will have access to the data and
//private members

//encapsulated class is the easiest to test in unit testing.

public class Encapsulation {
    public static void main(String[] args) {
        Person person = new Person("Brian", 30);
        person.DisplayInfo();

        person.setName("Patrick");
        person.setAge(32);
        person.DisplayInfo();

    }
}
class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void DisplayInfo(){
        System.out.println("name: "+ name + " Age: "+ age);
    }
}