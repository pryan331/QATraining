package org.java;

public class Employees {
    int id;
    String name;
    Address address;

    public Employees(int id, String name, Address address){
        this.id = id;
        this.address = address;
        this.name = name;
    }
    public void print(){
        System.out.println(id + " " + name);
        System.out.println(address.city+" "+address.state+" "+address.country);
    }

    public static void main(String[] args) {
        Address address1 = new Address("McLean", "Virginia", "USA");
        Employees emp = new Employees(1, "Brian", address1);
        emp.print();
    }
}
