package org.example;

public class Question12 {
    public static  int arrayElementDivision(int []arr, int index, int divisor){
        try{
            int element = arr[index];
            try{
                int result = element/divisor;
                return result;
            }
            catch (ArithmeticException e){
                throw new RuntimeException(e);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        int [] arr = new int []{34,12,32,5,32};
        System.out.println(arrayElementDivision(arr,4,0));
    }
}
