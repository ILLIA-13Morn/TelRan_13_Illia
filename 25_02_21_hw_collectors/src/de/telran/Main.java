package de.telran;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Main {
    public static void main(String[] args) {

        IntStream intStream = IntStream.of(7, 8, 3, 2, 1);

        int sum = intStream.mapToObj(value -> value).collect(summingInt(value -> value * value));

        /*int sqr = intStream.mapToObj(reducing(1,(res,elt)->res * elt * elt);*/

        Stream<String> stringStream = Stream.of("идем", "молод", "долом", "меди");

        Predicate<String> Palindrome = str -> Palindrome(str);
        Map<Boolean, List<String>> strByPalindrome = stringStream.collect(partitioningBy(Palindrome));

    }

    private static boolean Palindrome(String str) {
        return new StringBuilder(str)
                .reverse()
                .toString()
                .equals(str);
    }
}
