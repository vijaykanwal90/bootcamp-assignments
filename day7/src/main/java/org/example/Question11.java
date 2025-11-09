package org.example;
public class Question11 {
    public static int divisionWithException (int first , int second) {
        try {
            return first / second;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Division Completed");
        }
        return 0;
    }

    public static void main(String[] args) {
//        In Java, the finally block always executes before the method returns — even if there’s a return statement in the try or catch.
        System.out.println(divisionWithException(13,4));

    }
}
