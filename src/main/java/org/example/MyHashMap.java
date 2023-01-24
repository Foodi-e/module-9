package org.example;

import java.util.LinkedList;

public class MyHashMap<K, V> {
    private class Node {
        K key;
        V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
    private int nodes;
    private int buckets;
    private LinkedList<Node> bucketsLinkedList[];

    public MyHashMap() {
        this.buckets = 4;
        this.bucketsLinkedList = new LinkedList[4];
        for(int i=0; i<4; i++) {
            this.bucketsLinkedList[i] = new LinkedList<>();
        }
    }

    private int hashFunction(K key) {
        int bi = key.hashCode();
        return Math.abs(bi) % buckets;
    }

    private int searchInLL(K key, int bi) {
        LinkedList<Node> ll = bucketsLinkedList[bi];

        for(int i=0; i<ll.size(); i++) {
            if(ll.get(i).key == key) {
                return i;
            }
        }

        return -1;
    }

    public int size(){
        return nodes;
    }

    public void put(K key, V value) {
        int bi = hashFunction(key);
        int di = searchInLL(key, bi);
        if(di == -1) {
            bucketsLinkedList[bi].add(new Node(key, value));
            nodes++;
        } else {
            Node node = bucketsLinkedList[bi].get(di);
            node.value = value;
        }
        double lambda = (double) nodes / buckets;
    }

    public V remove(K key) {
        int bi = hashFunction(key);
        int di = searchInLL(key, bi);
        if(di == -1) {
            return null;
        } else {
            Node node = bucketsLinkedList[bi].remove(di);
            nodes--;
            return node.value;
        }
    }

    public V get(K key) {
        int bi = hashFunction(key);
        int di = searchInLL(key, bi);
        if(di == -1) {
            return null;
        } else {
            Node node = bucketsLinkedList[bi].get(di);
            return node.value;
        }
    }

}
