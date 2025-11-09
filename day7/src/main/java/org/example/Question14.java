package org.example;
import java.util.*;


public class Question14 {
    public static boolean emailValidation (String email) throws  EmailValidation {
            if(!email.contains("@")){
                throw new EmailValidation("Email should contain @ ");
            }
            return true;

    }
    public static void main(String[] args) {
//        System.out.println(emailValidation("vijay@gmail.com"));
        try {

            boolean valid = emailValidation("vijaygmail.com");
            System.out.println("Email is valid");



        }
        catch (EmailValidation e){
            System.out.println("Email is not valid");
            System.out.println(e.getMessage());
        }
    }
}
