package org.example.oop.datastructures;

public class LinkedListElement<E> {
    public LinkedListElement<E> next;
    public LinkedListElement<E> prev;
    public E value;

    public LinkedListElement(E value) {
        this.value = value;
    }
}
