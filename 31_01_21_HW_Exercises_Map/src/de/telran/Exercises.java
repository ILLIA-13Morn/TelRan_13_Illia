package de.telran;

import java.util.*;

public class Exercises {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> res = new HashMap<Integer,Integer>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(1);

        Set<Integer> unique = new HashSet<Integer>(list);
        for ( Integer key : unique) {
            res.put(key,Collections.frequency(list,key));

        }
        System.out.println(res);
    }
}
