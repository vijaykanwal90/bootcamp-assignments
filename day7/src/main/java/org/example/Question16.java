package org.example;
class InvalidAmount extends  RuntimeException {
    public InvalidAmount (String message){
        super(message);
    }

}
class Overdraft extends  RuntimeException {
    public Overdraft (String message){
        super(message);
    }

}

class BankingApplication {
    static int totalAccounts =0;
    int balance;
    String holderName;
    String accountNumber;
    public BankingApplication (){
        totalAccounts +=1;
    }
    public BankingApplication(String holderName, String accountNumber, int balance){
        this.holderName =holderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(int amount){
          if(amount <0){
              throw  new InvalidAmount("Deposit amount should be greater than 0");
          }
            balance += amount;
        System.out.println("You bank balance after adding " + amount + " is " + balance);
    }
    public void withdraw(int amount) {

        if(amount > balance){
            throw new Overdraft("withdrawl amount should be less than balance");
        }
        balance -=amount;
        System.out.println("Your balance  after withdrawing " + amount + " is " + balance);
    }
    public int getBalance(){
        return balance;
    }
}

public class Question16 {
    public static void main(String[] args) {
        BankingApplication b1 = new BankingApplication("vijay","3243424234",3456);
        System.out.println(b1.getBalance());
        try{
            b1.withdraw(4000);

        }
        catch (Overdraft e){
            System.out.println(e.getMessage());
        }
        try{
            b1.deposit(-788);
        }
        catch (InvalidAmount e){
            System.out.println(e.getMessage());
        }

    }
}
