package org.example;

import java.util.Arrays;

public class MyQueue<T> {
    private Object[] values;
    private final static int DEFAULT_SIZE = 0;
    private int capacity = DEFAULT_SIZE;
    private int valuesCnt = 0;

    MyQueue(){
        values = new Object[DEFAULT_SIZE];
    }
    MyQueue(int capacity) {
        values = new Object[capacity];
        this.capacity = capacity;
    }

    private Object[] resize(int capacity){
        this.capacity = capacity;
        return values = Arrays.copyOf(values, capacity);
    }

    public boolean add(T e) {
        if(valuesCnt == values.length){
            values = resize(values.length+1);
        }
        values[valuesCnt] = e;
        valuesCnt++;
        return true;
    }

    public void clear(){
        values = new Object[0];
        capacity = 0;
    }

    public int getCapacity(){
        return values.length;
    }

    public int size(){
        return valuesCnt;
    }

    public Object peek(){
        return values[0];
    }

    public Object poll(){
        Object tmp = values[0];
        for (int i = 0; i < values.length-1; i++) {
            values[i] = values[i+1];
        }
        values = resize(values.length-1);
        valuesCnt--;
        return tmp;
    }
}
