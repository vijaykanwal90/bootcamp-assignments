package org.example;
import java.util.*;
class ProducerConsumerClass {
    static int bufferSizeLimit = 5;
    ArrayDeque<Integer> sharedBuffer = new ArrayDeque<>();
    boolean producingFinished = false;
    public ProducerConsumerClass(ArrayDeque<Integer> sharedBuffer) {
        this.sharedBuffer = sharedBuffer;
    }

    public void produce() {
            for (int i = 1; i <= 50; i++) {
                synchronized (sharedBuffer) {

                try {
                    while (sharedBuffer.size() == bufferSizeLimit  ) {
                        sharedBuffer.wait();
                    }
                    System.out.println("produced by  " + Thread.currentThread().getName() + " " + i);
                    sharedBuffer.add(i);
                    sharedBuffer.notifyAll();

                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }

            }

        }
            synchronized (sharedBuffer){
                producingFinished=true;
                sharedBuffer.notifyAll();
            }
    }

    public void consume() {

            while(true) {
                synchronized (sharedBuffer) {
                try {

                    while (sharedBuffer.isEmpty() && !producingFinished) {
                        sharedBuffer.wait();
                    }
                    if (sharedBuffer.isEmpty() && producingFinished) {
                        return;
                    }
                    int data = sharedBuffer.removeFirst();
                    System.out.println("Consumed data by " + Thread.currentThread().getName() + " is " + data);
                    sharedBuffer.notifyAll();

                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                    Thread.currentThread().interrupt();
                    return;

                }
            }
            try { Thread.sleep(1); } catch (Exception ignored) {}
        }
    }
}
public class ProducerConsumer {

    public static void main(String[] args) throws InterruptedException {
        ArrayDeque<Integer> sharedBuffer = new ArrayDeque<>();
        ProducerConsumerClass obj = new ProducerConsumerClass(sharedBuffer);

            Thread producer = new Thread(() -> {
                try {

                    obj.produce();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            });
            Thread consumer1 = new Thread(() -> {
                try {
                    obj.consume();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            });
            Thread consumer2 = new Thread(() -> {
                try {
                    obj.consume();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            });
            producer.start();
            consumer2.start();
            consumer1.start();
        }


}
