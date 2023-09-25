package org.java;
//Encapsulation example
public class BOFAAccount {
    private String Name;
    private int AccountNumber;
    private int RoutingNumber;
    private double Balance;

    public BOFAAccount(String Name, int AccountNumber, int RoutingNumber, double Balance){
        this.Name = Name;
        this.AccountNumber = AccountNumber;
        this.RoutingNumber = RoutingNumber;
        this.Balance = Balance;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }

    public int getRoutingNumber() {
        return RoutingNumber;
    }

    public void setRoutingNumber(int routingNumber) {
        RoutingNumber = routingNumber;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }
    public void Depositing(double amount){
        if(amount>0){
            Balance += amount;
            System.out.println(amount + " deposited, New balance: $ " + Balance);
        } else {
            System.out.println("deposit amount has to be more than 0.");
        }
    }

    public void Withdrawing(double amount){
        if(amount > 0 && amount <= Balance){
            Balance -= amount;
            System.out.println(amount+" withdrawn, new balance $ " + Balance);
        } else {
            System.out.println("Cannot withdraw more than balance.");
        }
    }
    public void viewDetails(){
        System.out.println("Name: "+ Name+" Account Number: "+AccountNumber+" Routing Number: "+RoutingNumber+ " Balance: $"+Balance);
    }
}
