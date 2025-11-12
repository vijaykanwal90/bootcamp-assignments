package org.example;

import java.util.HashMap;

// Find the first non-repeating character
public class Question3 {
    public static void main(String[] args) {
        String str = "aerfsdajffsjuekicshdd";
        HashMap<Character,Integer> map= new HashMap<>();
        for (int i =0;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        for(int i =0;i<str.length();i++){
            if(map.get(str.charAt(i))==1){
                System.out.println("First non-repeating character is " + str.charAt(i));
                break;
            }
        }
    }
}
