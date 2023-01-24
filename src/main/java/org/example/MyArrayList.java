package org.example;

import java.util.Arrays;

public class MyArrayList<T> {
    private Object[] values;
    private final static int DEFAULT_SIZE = 0;
    private int capacity = DEFAULT_SIZE;
    private int valuesCnt = 0;

    MyArrayList(){
        values = new Object[DEFAULT_SIZE];
    }
    MyArrayList(int capacity) {
        values = new Object[capacity];
        this.capacity = capacity;
    }

    public void show(){
        System.out.println(values.length);
        System.out.println(capacity);
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

    public int getCapacity(){
        return values.length;
    }

    public int length(){
        return valuesCnt;
    }

    public Object get(int index){
        return values[index];
    }

    public void remove(int index){
        for (int i = index; i < values.length-1; i++) {
            values[i] = values[i+1];
        }
        values = resize(values.length-1);
        valuesCnt--;
    }

    public void clear(){
        values = new Object[0];
        capacity = 0;
    }



}
