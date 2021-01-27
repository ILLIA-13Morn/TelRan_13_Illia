package de.telran;

public interface OurSet<T> extends Iterable<T> {

    boolean add(T elt);

    boolean remove(T elt);

    boolean contains(T elt);

    int size();

    boolean addAll(OurSet<T> another);

    boolean retainAll(OurSet<T> another);

    boolean removeAll(OurSet<T> another);

}
