package org.example;
class MathUtils{

    public static int max(int a, int b){
        return  a>b ? a:b;
    }
    public static int min(int a, int b){
        return  a<b ? a:b;
    }
    public static int average(int a, int b){
        return  (a+b)/2;
    }

}

public class Question8 {
    public static void main(String[] args) {
        System.out.println(MathUtils.max(443,3234));
        System.out.println(MathUtils.min(543,33234));
        System.out.println(MathUtils.average(43,45));
    }
}

