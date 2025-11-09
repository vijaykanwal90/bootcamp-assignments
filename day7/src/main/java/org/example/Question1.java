package org.example;

public class Question1 {

    public static int sum(int number){
        int result =0;
        while(number>0){
            result += number%10;
            number = number/10;
        }
        return result;
    }
    public static void main(String[] args) {
        int ans = sum(1234);
        System.out.println(ans);
    }

}
