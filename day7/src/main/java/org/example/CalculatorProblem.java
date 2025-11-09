package org.example;
class Calculator {

    public int add(int a, int b){
        return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }public int multiply(int a, int b){
        return a*b;
    }public int divide(int a, int b){
        if(b==0){
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return a/b;
    }



}
public class CalculatorProblem {


    public static void main(String[] args) {
            int a = 4;
            int b = 0;
            Calculator cal = new Calculator();
            System.out.println(cal.add(a,b));
            System.out.println(cal.subtract(a,b));
            System.out.println(cal.multiply(a,b));
            System.out.println(cal.divide(a,b));

    }
}
