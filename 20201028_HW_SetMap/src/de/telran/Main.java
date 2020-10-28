package de.telran;

import java.util.*;
import java.util.concurrent.LinkedTransferQueue;

public class Main {
    public static void main(String[] args) {

        // Set Task 1
        List<Integer> input = Arrays.asList(1, 2, 3, 3, 4, 5, 6, 4); //{1,2,3,3,4,5,6,4} -> {1,2,3,4,5,6}
        System.out.println(removeDuplicates(input));
        // Set Task 2
        System.out.println(getDuplicates(input)); //{1,2,3,3,4,5,6,4} -> {3,4}
        // Map Task 1
        Map<String, String> map = new LinkedHashMap<>();
        map.put("a", "Hi");
        map.put("b", "There");
        System.out.println(mergeMapValue(map));
        // Map Task 2
        String[] str = {"a", "b", "a", "c", "b"}; //{“a”: true, “b”: true, “c”: false}
        System.out.println(wordMultiple(str));
        // Map Task 3
        String[] names = {"anna", "naan", "nana", "ivan", "vani", "piotr", "navi"};
        System.out.println(Anagram(names, "anna"));


    }

    // Set Task 1

    private static Set<Integer> removeDuplicates(List<Integer> input) {
        return new LinkedHashSet<>(input);
    }

    // Set Task 2
    private static Set<Integer> getDuplicates(List<Integer> input) {
        Set<Integer> uniqueList = new LinkedHashSet<>();
        Set<Integer> duplicatesList = new LinkedHashSet<>();
        for (Integer i : input) {
            if (!uniqueList.add(i)) {
                duplicatesList.add(i);
            }
        }
        return duplicatesList;
    }

    // Map Task 1
    private static Map<String, String> mergeMapValue(Map<String, String> map) {
        Map<String, String> mergeMap = new LinkedHashMap<>();
        if (map.containsKey("a") && map.containsKey("b")) {
            mergeMap.put("ab", map.get("a") + map.get("b"));
        }
        return mergeMap;
    }

    // Map Task 2
    private static Map<String, Boolean> wordMultiple(String[] str) {
        Map<String, Boolean> res = new HashMap<>();
        for (String s : str) {
            res.computeIfPresent(s, (key, value) -> true);
            res.computeIfAbsent(s, string -> false);
        }
        return res;
    }

    // Map Task 3
    private static String Sorted(String string) {
        char[] charArr = string.toCharArray();
        Arrays.sort(charArr);
        return new String(charArr);
    }

    private static Map<String, List<String>> Anagram(String[] anagrams, String name) {
        List<String> namesList = new ArrayList<>();
        Map<String, List<String>> anagramMap = new HashMap<>();
        for (String str : anagrams) {
            if (Sorted(str).equals(Sorted(name))) {
                namesList.add(str);
            }
        }
        anagramMap.put(name, namesList.subList(1, namesList.size()));
        return anagramMap;
    }
}
