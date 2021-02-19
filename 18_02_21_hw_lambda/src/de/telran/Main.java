package de.telran;

import java.util.*;
import java.util.function.Function;


public class Main {
    public static void main(String[] args) {

        Function<List<String>, List<String>> lambda = (list) -> new ArrayList<>(new LinkedHashSet<>(list));

        List<String> list = Arrays.asList("abc", "cde", "abc", "fgh", "cde", "ijk");
        lambda.apply(list).forEach(System.out::println);

        int a = 3;
        int b = 4;
        int c = 5;
        
        Function<Integer, Integer> f = (x) -> a * x * x + b * x + c;
            System.out.println(f.apply(12));
        }
}
