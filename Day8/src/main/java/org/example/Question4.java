package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Question4 {
    public static ArrayList<Integer> targetSum(int []arr,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> ls = new ArrayList<>();
        for(int i =0;i<arr.length;i++){
            if(map.containsKey(target-arr[i])){
                ls.add(map.get(target-arr[i]));
                ls.add(i);
                return ls;
            }
            else {
                map.put(arr[i],i);
            }
        }
        return ls;
    }

    public static void main(String[] args) {
        int target = 8;
        int [] arr = {8,43,5,65,2,4,6,8,3,0};
        ArrayList<Integer> indices = targetSum(arr,target);
        if(!indices.isEmpty()){
            System.out.println("The indices are " +  indices.get(0) + " and " + indices.get(1));

        }
        else {
            System.out.println("Target sum not found");
        }
    }
}
