package de.telran;

import java.util.Iterator;

public class OurLinkedList<T> implements OurList<T> {

    Node<T> first; //null
    Node<T> last; //null
    int size; // 0

    private static class Node<T> {
        Node<T> next;
        Node<T> prev;
        T element;

        public Node(Node<T> next, Node<T> prev, T element) {
            this.next = next;
            this.prev = prev;
            this.element = element;

        }
    }

    @Override
    public void addLast(T element) {
        Node<T> node = new Node<>(null, null, element);
        if (size == 0) {
            first = last = node;
        } else {

            last.next = node;
            last = node;
        }
        size++;
    }

    @Override
    public T get(int index) {
        Node<T> node = getNodeByIndex(index);
        return node.element;
    }

    @Override
    public void set(int index, T value) {
        Node<T> needle = getNodeByIndex(index);
        needle.element = value;

    }

    private Node getNodeByIndex(int index) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();
        Node<T> res = first;
        for (int i = 0; i < index; i++) {
            res = res.next;
        }
        return res;
    }

    @Override
    public T removeById(int index) {
        Node<T> nodeRemove = getNodeByIndex(index);
        T res = nodeRemove.element;
        removeNode(nodeRemove);
        return res;
    }

    private Node<T> discoveryNode(T element) {
        Node<T> current = first;
        while (current != null) {
            if (element.equals(current.element))
                return current;
            current = current.next;
        }
        return null;
    }

    private void removeNode(Node<T> toRemove) {
        Node<T> left = toRemove.prev;
        Node<T> right = toRemove.next;

        toRemove.prev = null;
        toRemove.next = null;
        toRemove.element = null;

        if (size == 1) {
            first = last = null;
        } else if (first == toRemove) {
            right.prev = null;
            first = right;
        } else if (last == toRemove) {
            left.next = null;
            last = left;
        } else {
            right.next = right;
            right.prev = left;
        }
        size--;
    }

    @Override
    public int size() {
        return size;
    }


    @Override
    public boolean remove(T obj) {
        Node<T> nodeRemove = discoveryNode(obj);
        if (nodeRemove == null)
            return false;
        removeNode(nodeRemove);
        return true;

    }

    @Override
    public boolean contains(T obj) {
        if (discoveryNode(obj) != null) return true;
        else return false;
    }

    @Override
    public void clear() {
        return;
    }

    @Override
    public Iterator<T> forwardIterator() {
        return null;
    }

    @Override
    public Iterator<T> backwardIterator() {
        return null;
    }

}
