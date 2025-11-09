package org.example;

class StaticCounter {
    static int counter;
    public StaticCounter(){

        counter = counter +1;
    }

}
public class Question7 {
    public static void main(String[] args) {
        StaticCounter s1 = new StaticCounter();
        System.out.println("the number of objects are " + StaticCounter.counter);
        StaticCounter s2 = new StaticCounter();
        System.out.println("the number of objects are " + StaticCounter.counter);


    }
}
