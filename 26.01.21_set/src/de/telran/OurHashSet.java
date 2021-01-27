package de.telran;

import de.telran.map.OurHaschMap;

import java.util.Iterator;

public class OurHashSet<T> implements OurSet<T>{

    private OurHaschMap <T, Object> source;

    private final Object stubValue = new Object();

    @Override
    public boolean add(T elt) {
        return source.put(elt,stubValue) == null;
    }

    @Override
    public boolean remove(T elt) {
        return source.remove(elt) != null;
    }

    @Override
    public boolean contains(T elt) {
        return source.containsKey(elt);
    }

    @Override
    public int size() {
        return source.size();
    }

    @Override
    public boolean addAll(OurSet<T> another) {
        boolean res = false;
        for (T elt : another){
        res = this.add(elt);
        }
        return res;
    }


    @Override
    public boolean retainAll(OurSet<T> another) {
        Iterator<T> iterator = iterator();
        while (iterator.hasNext()){
            T elt = iterator.next();

            if (!another.contains(elt)){
                iterator.remove();
                return true;

            }
        }

        return false;
    }

    @Override
    public boolean removeAll(OurSet<T> another) {
        boolean res = false;

        for ( T elt: another) {
            res = this.remove(elt);

        }
        return res;

    }

    @Override
    public Iterator<T> iterator() {
        return source.keyIterator();
    }
}
