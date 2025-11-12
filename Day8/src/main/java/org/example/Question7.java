package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Multiplication {

    static private final Object lock = new Object();
    public void printTable(int number) {

        synchronized (lock) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " X " + i + " = " + number * i);
                try {
                    lock.notify();
                    if (i < 10) {
                        lock.wait();
                    }
                }
                catch (InterruptedException e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
public class Question7 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Multiplication multy = new Multiplication();
        try {


            executorService.submit(() -> {

                System.out.println(Thread.currentThread().getName());
                multy.printTable(2);
            });
            executorService.submit(() -> {
                System.out.println(Thread.currentThread().getName());
                multy.printTable(4);
            });
//        executorService.shutdown();
            executorService.awaitTermination(60, java.util.concurrent.TimeUnit.SECONDS);
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }

}
