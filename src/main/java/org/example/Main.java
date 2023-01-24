package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> arrayList = new MyArrayList<>(10);
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println("before remove");
        for (int i = 0; i < arrayList.length(); i++) {
            System.out.println(arrayList.get(i));
        }
        arrayList.remove(3);
        System.out.println("after remove");
        for (int i = 0; i < arrayList.length(); i++) {
            System.out.println(arrayList.get(i));
        }
        arrayList.clear();
        arrayList.show();
        LinkedList<Integer> linkedList = new LinkedList<>();
        Queue<Integer> queue;
        MyQueue<Integer> myQueue = new MyQueue<>();
        myQueue.add(0);
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        System.out.println(myQueue.peek());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.peek());
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.peek());
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(0);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.remove(1);
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        MyHashMap<String, String> myHashMap = new MyHashMap<>();
        myHashMap.put("Ukraine", "Kyiv");
        myHashMap.put("Poland", "Warsaw");
        myHashMap.put("Italy", "unknown");
        myHashMap.put("Ukraifdne", "Ksruiyiv");
        myHashMap.put("Poldftyand", "Wstrkyarsaw");
        myHashMap.put("Itsyjkaly", "unksrtynown");
        System.out.println(myHashMap.get("Poland"));
        System.out.println(myHashMap.get("Italy"));
        System.out.println(myHashMap.get("Ukraine"));
        System.out.println(myHashMap.size());
        myHashMap.remove("Italy");
        System.out.println(myHashMap.get("Poland"));
        System.out.println(myHashMap.get("Italy"));
        System.out.println(myHashMap.get("Ukraine"));
        System.out.println(myHashMap.size());


    }
}