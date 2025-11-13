package org.example;
import java.util.*;
class ProducerConsumerClass {
    static int bufferSizeLimit = 5;
    ArrayDeque<Integer> sharedBuffer = new ArrayDeque<>();

    public ProducerConsumerClass(ArrayDeque<Integer> sharedBuffer) {
        this.sharedBuffer = sharedBuffer;
    }

    public void produce() {
        synchronized (sharedBuffer) {
            for (int i = 1; i <= 50; i++) {
                try {
                    while (sharedBuffer.size() == bufferSizeLimit  ) {
                        sharedBuffer.wait();

                    }
                    System.out.println("producing " + i);
                    sharedBuffer.add(i);
                    sharedBuffer.notifyAll();

                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public void consume() {
        synchronized (sharedBuffer) {
            int counter=0;
            while (counter<=50) {
                try {
                    while (sharedBuffer.isEmpty()) {
                        sharedBuffer.wait();
                    }
                    int data = sharedBuffer.removeFirst();
                    System.out.println("Consumed data by " + Thread.currentThread().getName() + " is " + data);
                    counter++;
                    sharedBuffer.notifyAll();

                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                    Thread.currentThread().interrupt();
                    break;

                }
            }
        }
    }
}
public class ProducerConsumer {

    public static void main(String[] args) throws InterruptedException {
        ArrayDeque<Integer> sharedBuffer = new ArrayDeque<>();
        ProducerConsumerClass obj = new ProducerConsumerClass(sharedBuffer);
        Thread producer = new Thread(()->{
            try{

                obj.produce();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        });
        Thread consumer1 = new Thread(()->{
            try{
                obj.consume();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        });
        Thread consumer2 = new Thread(()->{
            try{
                obj.consume();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        });
//        consumer2.setPriority(6);
        producer.start();
        consumer2.start();
        consumer1.start();
    }
}
