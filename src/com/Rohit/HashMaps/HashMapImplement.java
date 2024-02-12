package com.Rohit.HashMaps;
import java.util.*;

public class HashMapImplement {
    public  static class MyHashMap<K, V> {
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;

        private class Node {
            V val;
            K key;

            Node(K key, V val) {
                this.key = key;
                this.val = val;
            }

        }
        private int n; // the number of entries in map

        private LinkedList<Node>[] buckets; // array of linkedList [ list,list,list]

        private void initBuckets(int N) { // - capacity of bucket array
            buckets = new LinkedList[N];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
        }
        public MyHashMap() {
            initBuckets(DEFAULT_CAPACITY);
        }
         private void rehash(){
            LinkedList<Node>[] oldBuckets= buckets;
            initBuckets(oldBuckets.length*2);
            n=0;
            for (var bucket:oldBuckets) {
                for (var node : bucket) {
                    put(node.key, node.val);
                }
            }
         }
        private int HashFunc(K key) {
            int hc = key.hashCode();
            return (Math.abs(hc)) % buckets.length;
        }

        // Traverse the ll and looks for  node with key if found it return its index else returns null
        private int searchInBucket(LinkedList<Node> l1, K key) {
            for (int i = 0; i < l1.size(); i++) {
                if (l1.get(i).key == key) {
                    return i;
                }
            }
            return -1;
        }
        public int size() {
            return n;
        }
        public V get(K key) {
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if (ei != -1) {
                Node currNode = currBucket.get(ei);
                return currNode.val;
            }
            return null;
        }
        public void put(K key, V val) {
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if (ei == -1) { // key does not exit we have insert a new node
                Node node = new Node(key, val);
                currBucket.add(node);
                n++;
            } else { // update acse
                Node currNode = currBucket.get(ei);
                currNode.val = val;
            }
            if(n>=buckets.length*DEFAULT_LOAD_FACTOR){
                rehash();
            }
        }
        public V remove(K key) {
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if (ei != -1) {
                Node currNode = currBucket.get(ei);
                V value = currNode.val;
                currBucket.remove(ei);
                n--;
                return value;
            }
            return null;
        }
    }
        public static void main(String[] args) {
            MyHashMap <String,Integer> mp=new MyHashMap<>();
            mp.put("a",1);
            mp.put("b",2);
            mp.put("c",3);
            System.out.println("Testing size "+ mp.size());
            mp.put("a",30);
            mp.remove("d");
            mp.remove("b");
            System.out.println("Testing size "+ mp.size());

            System.out.println("Testing element "+ mp.get("a"));
            System.out.println("Testing  element  "+ mp.get("c"));

        }
}
