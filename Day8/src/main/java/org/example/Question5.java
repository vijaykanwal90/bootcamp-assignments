package org.example;

import java.util.ArrayList;

public class Question5 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(3);
        list1.add(4);
        list1.add(8);
        list1.add(9);
        list1.add(14);
        list1.add(45);
        list1.add(89);

        list2.add(5);
        list2.add(12);
        list2.add(24);
        list2.add(26);
        list2.add(50);
        ArrayList<Integer> mergedList = new ArrayList<>();
        int i =0;
        int j =0;

        while(i<list1.size() && j<list2.size()){
            if(list1.get(i) < list2.get(j)){
                mergedList.add(list1.get(i));
                i++;
            }
            else {
                mergedList.add(list2.get(j));
                j++;
            }
        }
        if(i==list1.size()){
            while (j<list2.size()){
                mergedList.add(list2.get(j));
                j++;
            }
        }
        else {
            while (i<list1.size()){
                mergedList.add(list1.get(i));
                i++;
            }
        }
        System.out.println(mergedList);


    }
}
