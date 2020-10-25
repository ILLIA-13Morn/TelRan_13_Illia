package de.telran;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Ivan", "Maria", "Stephan", "John", "Amalia"));
        System.out.println("Task2: ");
        System.out.println(remove4Letters(names));

        List<Integer> list1 = new LinkedList<>(Arrays.asList(1, 4, 7, 5));
        List<Integer> list2 = new LinkedList<>(Arrays.asList(1, 3, 7, 7));
        System.out.println("Task3: ");
        System.out.println(compareLists(list1, list2));

        List<String> stringArrayList1 = new ArrayList<>(Arrays.asList("aa", "bb", "cc", "dd"));
        List<String> stringArrayList2 = new ArrayList<>(Arrays.asList("cc", "dd", "aa", "bb"));
        System.out.println("Task4: ");
        System.out.println(IsItCycle(stringArrayList1, stringArrayList2));

        List<Integer> integerList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Task5: ");
        System.out.println(reverseList(integerList));

        List<Object> objectList1 = new ArrayList<>(Arrays.asList(200, "hose-power"));
        List<Object> objectList2 = new ArrayList<>(Arrays.asList(100, "strength of wind"));
        System.out.println("Task6: ");
        System.out.println(mergeLists(objectList1, objectList2));


        System.out.println("Task7");
        System.out.println(withoutElements(integerList, 10));

    }

    private static List<String> remove4Letters(List<String> names) {

        Iterator<String> i = names.iterator();

        while (i.hasNext()) {
            String name = i.next();
            if (name.length() == 4)
                i.remove();
        }
        return names;
    }

    private static List<String> compareLists(List<Integer> list1, List<Integer> list2) {
        List<String> compareResult = new LinkedList<>();

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) == list2.get(i)) {
                compareResult.add("Yes");
            } else
                compareResult.add("No");
        }
        return compareResult;
    }

    private static boolean IsItCycle(List<String> list1, List<String> list2) {
        if (list1.size() == list2.size()) {
            for (int i = 0; i < list1.size(); i++) {
                Collections.rotate(list1, 2);
                if (list1.equals(list2))
                    return true;
            }
        }
        return false;
    }

    private static List<Integer> reverseList(List<Integer> list) {
        Collections.reverse(list);
        return list;
    }
    
    private static List<Object> mergeLists(List<Object> list1, List<Object> list2) {
        list1.addAll(list2);
        return list1;
    }

    public static List<Integer> withoutElements(List<Integer> list, int n) {
        List<Integer> listWithoutElements = new LinkedList<>();
        for (Integer integer : list) {
            if (integer <= n) {
                listWithoutElements.add(integer);
            }
        }
        return listWithoutElements;
    }
}

