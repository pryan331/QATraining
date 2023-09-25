package org.java;
//OOP Concept
//Polymorphism??
//the word itself means many forms, in single words we can define poly
//as the ability to change one thing into different forms or to behave differently.
//Compile time Poly...
//Runtime Poly...

//method overriding
//method overloading


public class Polymorphism {
    public static void main(String[] args) {
        Shapes s0 = new Shapes();
        Shapes s1 = new Oval();
        Shapes s2 = new Square();
        //s0.draw();
        //s1.draw();
        //s2.draw();
        BankAccount account1 = new BankAccount(1000);
        SavingsAccount acc2 = new SavingsAccount(2000, 0.05);
        CheckingAccount acc3 = new CheckingAccount(3000, 1);
        account1.displayBalance();
        acc2.displayBalance();
        account1.withdraw(500);
        acc2.withdraw(1500);
        acc3.withdraw(500);
        account1.displayBalance();
        acc2.displayBalance();
        acc3.displayBalance();
    }
}
class Shapes{
    void draw(){
        System.out.println("Drawing a shape");
    }
}
class Oval extends Shapes{
    @Override
    void draw(){
        System.out.println("Drawing an oval");
    }
}

class Square extends Shapes {
    @Override
    void draw(){
        System.out.println("Drawing a new square");
    }
}

class BankAccount{
    protected double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }
    public void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("Withdraw success: $"+ amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
    public void displayBalance(){
        System.out.println("Current balance: $" + balance);
    }
}
class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(double balance, double interestRate){
        super(balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayBalance(){
        System.out.println("Savings account balance: $"+balance);
    }
}

class CheckingAccount extends BankAccount{
    private double interestRate;

    public CheckingAccount(double balance, double interestRate){
        super(balance);
        this.interestRate = interestRate;
    }
    @Override
    public void displayBalance(){
        System.out.println("Checking account balance: $"+balance);
    }
}