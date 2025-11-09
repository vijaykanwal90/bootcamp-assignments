package org.example;

import java.util.Scanner;

public class Question3 {
    public static int getFactorial(int number){
        if(number <=1){
            return 1;
        }

        int fact = 1;
        for(int i=2;i<=number;i++){
           fact  = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to get factorial of:");
        int number = sc.nextInt();
        int factorial  = getFactorial(number);
        System.out.println("the factorial is " + factorial);
    }
}
