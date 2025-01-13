package org.example.oop.datastructures;

public class LinkedList<E> {
    private LinkedListElement<E> head;
    private LinkedListElement<E> tail;

    public void add(E element){
        LinkedListElement<E> linkedListElement = new LinkedListElement<>(element);
        if (head == null){
            head = linkedListElement;
            tail = linkedListElement;
        } else {
            tail.next = linkedListElement;
            linkedListElement.prev = tail;
            tail = linkedListElement;
        }
    }

    public E get(int index){
        return getElement(index).value;
    }

    public LinkedListElement<E> getElement(int index){
        LinkedListElement<E> element = head;
        for (int i = 0; i < index; i++) {
            element = element.next;
        }
        return element;
    }

    public void remove(int index){
        LinkedListElement<E> elementToRemove = getElement(index);
        if (elementToRemove == head){
            head = elementToRemove.next;
        }

        if (elementToRemove == tail) {
            tail = elementToRemove.prev;
        }

        elementToRemove.prev.next = elementToRemove.next;
        elementToRemove.next.prev = elementToRemove.prev;
    }
}
