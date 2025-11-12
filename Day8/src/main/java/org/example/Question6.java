package org.example;

class MultiplicationThread implements Runnable {
    int number;
    static private final Object lock = new Object();

    public MultiplicationThread(int number) {
        this.number = number;
    }

    public void run() {
        printTable(number);
    }

    public void printTable(int number) {
        synchronized (lock) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " X " + i + " = " + number * i);
                try {
                    lock.notify();
                    if (i < 10) {
                        lock.wait();
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

}

public class Question6 {
    public static void main(String[] args) {

        MultiplicationThread obj1 = new MultiplicationThread(2);
        MultiplicationThread obj2 = new MultiplicationThread(4);
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
