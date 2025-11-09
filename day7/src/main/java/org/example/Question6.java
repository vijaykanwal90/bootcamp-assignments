package org.example;

class BankAccount {
    String holderName;
    String accountNumber;
    int balance;
    public BankAccount (String holderName , String accountNumber, int balance){

        this.holderName = holderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

}

public class Question6 {
    public static void main(String[] args) {
        String name = "vijay";
        String accountNumber = "2341234343434";
        int balance = 234534;
        BankAccount person1 = new BankAccount(name,accountNumber, balance);
        System.out.println(person1.holderName + " with account number "  + person1.accountNumber + " having balance of " + person1.balance);

    }
}
