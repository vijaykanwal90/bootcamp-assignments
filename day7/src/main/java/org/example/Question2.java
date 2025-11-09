package org.example;

import java.util.Scanner;

public class Question2 {
    public static void multiplication(int number){
        for(int i =1;i<=10;i++){
            System.out.println(number + " X " + i + " = " + number*i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for multiple table:");
        int number = sc.nextInt();
        multiplication(number);
    }
}
