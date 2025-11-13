package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@FunctionalInterface
interface NumberRule {
    boolean apply(int n);
}

public class FunctionalAssignment {
    public static void main(String[] args) {
//        List<Integer> nums = Arrays.asList(3, 10, 15, 8, 21, 14, 7);
        List<Integer> nums = Arrays.asList(3, 10, 15, 8, 21, 14, 7);

        NumberRule isEven = (number) -> number % 2 == 0;
        NumberRule isPrime = (number) -> {
            if (number <= 1) return false;
            if (number == 2) return true;
            if (number % 2 == 0) return false;
            for (int i = 3; i * i <= number; i += 2) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        };
        List<Integer> result = nums.stream()
                                    .filter((number)-> isEven.apply(number) && isPrime.apply(number))
                                    .map((number)->number*number)
                                    .collect(Collectors.toList());
        System.out.println(result);

        Optional<Integer> optional =  nums.stream()
                .filter((number)-> isEven.apply(number) && isPrime.apply(number))
                .map((number)->number*number).findFirst();
        optional.ifPresentOrElse(System.out::println,()->{
            System.out.println("No Matching number found");
        });
    }
}
