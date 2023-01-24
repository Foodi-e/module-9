package org.example;

import java.util.Objects;

public class MyLinkedList<T> {
    static class Node{
        Object element;
        Node next;

        public Node(Object element) {
            this.element = element;
        }
    }

    private Node first;
    private Node last;
    private int size;



    public void add(T element){
        Node newNode = new Node(element);
        if(size == 0){
            first = last = newNode;
        } else{
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    public int size(){
        return size;
    }

    public void clear(){
        first = last = null;
        size = 0;
    }

    private Node get(int index) {
        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public Object remove (int index) {
        Objects.checkIndex (index, size) ;
        Object removedElement;
        if (index == 0) {
            removedElement = first.element;
            first = first.next;
            if (first == null) {
                last = null;
            }
        } else {
            Node prev = get(index - 1);
            removedElement = prev. element;
            prev.next = prev.next.next;
            if(index == size - 1){
                last = prev;
            }
        }
        size--;
        return removedElement;
    }

}
