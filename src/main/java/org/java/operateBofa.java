package org.java;

public class operateBofa {
    public static void main(String[] args) {
        BOFAAccount account = new BOFAAccount("Kim", 123456, 234567, 50000);
        account.viewDetails();
        account.Depositing(5000);
        account.viewDetails();
        account.setBalance(20000);
        account.Withdrawing(200.68);
        account.viewDetails();
        System.out.println("Final Balance: $"+ account.getBalance());
    }
}
