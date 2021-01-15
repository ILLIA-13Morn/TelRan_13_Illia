package de.telran;

import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;

import static org.junit.jupiter.api.Assertions.*;

class OurHaschMapTest {
public OurHaschMapTest() {
}
    @Test
    public void testSizePut_emptyObject_newElements() {
        OurMap<Integer, String> newMap = new OurHaschMap<>();
        newMap.put(3, "f");
        newMap.put(2, "b");
        newMap.put(1, "c");
        assertEquals (3, newMap.size());
    }

    @Test
    public void testGetContains_NotEmptyObject_existKey() {
        OurMap<Integer, String> newMap = new OurHaschMap<>();
        newMap.put(1, "a");
        newMap.put(2, "b");
        newMap.put(3, "c");
        assertEquals("b", newMap.get(2));
        assertEquals("a", newMap.get(1));
        assertEquals("c", newMap.get(3));
    }

    @Test
    public void testGetContains_NotEmptyObject_notExistKey() {
        OurMap<Integer, String> newMap = new OurHaschMap<>();
        newMap.put(1, "a");
        newMap.put(2, "b");
        newMap.put(3, "c");
        assertEquals(null, newMap.get(5));
    }

    @Test
    public void testGetContains_emptyObject_notExistKey() {
        OurMap<Integer, String> newMap = new OurHaschMap<>();
        assertEquals(null, newMap.get(5));
    }

    @Test
    public void testRemove_NotEmptyObject_existKey() {
        OurMap<Integer, String> newMap = new OurHaschMap<>();
        newMap.put(1, "a");
        newMap.put(2, "b");
        newMap.put(3, "c");
        assertEquals(3, newMap.size());
        newMap.remove(2);
        assertEquals(2, newMap.size());
        assertEquals(null, newMap.get(2));
    }

    @Test
    public void testRemove_NotEmptyObject_notExistKey() {
        OurMap<Integer, String> newMap = new OurHaschMap<>();
        newMap.put(1, "a");
        newMap.put(2, "b");
        newMap.put(3, "c");
        assertEquals(3, newMap.size());
        newMap.remove(5);
        assertEquals(3, newMap.size());
        assertEquals(null, newMap.get(5));
    }
}