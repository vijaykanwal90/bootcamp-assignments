package org.example;

import java.util.ArrayList;
import java.util.List;

class Customer {
    int id ;
    String name;
    String email;
    public Customer (){}
    public Customer (int id , String name, String email){
        this.id = id;
        this.name = name;
        this.email =email;
    }
    @Override
    public String toString(){
        return "Customer Details: name " + name + ", id " + id + ", email " + email;

    }

}

public class Question15 {

    public static void main(String[] args) {
        Customer c1 = new Customer(1,"Customer1", "Customer1@gmail.com");
        Customer c2 = new Customer(2,"Customer2", "Customer2@gmail.com");
        Customer c3 = new Customer(3,"Customer3", "Customer3@gmail.com");

        List<Customer> ls = new ArrayList<>();
        ls.add(c1);
        ls.add(c2);
        ls.add(c3);
        for(Customer emp : ls){
            System.out.println(emp.toString());
        }
    }
        
}
