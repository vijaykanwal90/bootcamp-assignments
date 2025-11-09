package org.example;

import java.util.ArrayList;
import java.util.List;

class NegativePrice extends  RuntimeException{
    public NegativePrice(String message){
        super(message);
    }
}
class Product {
    private int id;
    private String name;
    private int price;
    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        if(price <0){
            throw  new NegativePrice("Price cannot be negative "+ name);
        }
        this.price = price;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
public class Question18 {
    public static void main(String[] args) throws  NegativePrice{
        List<Product> list = new ArrayList<>();

        try {


            list.add(new Product(1,"product1",2345));
            list.add(new Product(2,"product2",6745));
            list.add(new Product(3,"product3",-2345));
            list.add(new Product(4,"product4",6345));

        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        for(Product prod:list){
            System.out.println("The product id is " + prod.getId() + " and name is " + prod.getName() + " and price is " + prod.getPrice());
        }


    }
}
