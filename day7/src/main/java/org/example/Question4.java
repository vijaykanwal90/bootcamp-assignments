package org.example;

public class Question4 {
    public static int  reverse(int digit){
        int reverseNumber = 0;
        int number = digit;
        while(number > 0){
            int rem = number%10;
            reverseNumber = reverseNumber * 10 + rem;
            number = number/10;

        }
        return reverseNumber;
    }

    public static void main(String[] args) {
        int digit = 32430;
       int result =  reverse(digit);
        System.out.println(result);
    }
}
