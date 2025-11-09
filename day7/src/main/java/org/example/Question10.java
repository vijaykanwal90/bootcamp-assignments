package org.example;
class Car {
    String model ;
    int price;
    public Car (String model){
        this.model = model;
    }

    public Car(String model, int price){
        this.model = model;
        this.price = price;
    }

}

public class Question10 {

    public static void main(String[] args) {

        Car car1 = new Car("model1");
        Car car2 = new Car("model2",345438);
        System.out.println("the model is " + car1.model + " and price " + car1.price);
        System.out.println("the model is " + car2.model + " and price " + car2.price);
    }
}
