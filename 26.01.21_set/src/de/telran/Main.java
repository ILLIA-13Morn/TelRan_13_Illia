package de.telran;

public class Main {
    public static void main(String[] args) {

        OurSet<Integer> myHashSet = new OurHashSet<>();

        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(3);
        myHashSet.add(4);
        myHashSet.add(5);
        myHashSet.add(6);


        for (int i : myHashSet)
            System.out.println(i);

        System.out.println("Before remove:");
        for (int i : myHashSet)
            System.out.println(i);

        myHashSet.remove(1);
        System.out.println("After remove:");
        for (int i : myHashSet)
            System.out.println(i);

        System.out.println("Does myHashSet contain '2'? " + myHashSet.contains(2));
        System.out.println("Does myHashSet contain '11'? " + myHashSet.contains(11));

        System.out.println("Now myHashSet size is " + myHashSet.size());


        OurSet<String> ls1 = new OurHashSet<>();
        ls1.add("a");
        ls1.add("b");
        ls1.add("c");
        ls1.add("d");

        OurSet<String> ls2 = new OurHashSet<>();
        ls2.add("a");
        ls2.add("b");
        ls2.add("c");
        ls2.add("d");
        ls2.add("e");
        ls2.add("f");
        ls2.add("g");

        OurSet<String> set1 = new OurHashSet<>();
        set1.addAll(ls1);

        OurSet<String> set2 = new OurHashSet<>();
        set2.addAll(ls2);
        set2.retainAll(set1);

        OurSet<String> set3 = new OurHashSet<>();
        set3.addAll(ls2);
        set3.removeAll(set1);

        for (String diffElement : set2) {
            System.out.println(diffElement.toString());
        }

    }
}
