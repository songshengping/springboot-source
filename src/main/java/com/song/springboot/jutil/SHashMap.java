package com.song.springboot.jutil;

/**
 * @Description 模拟HashMap
 * @Date 2020/8/23 21:28
 * @Created by Jeremy
 */
public class SHashMap<K,V> {

    private int size;

    private Node[] node;

    public int default_size = 10;

    SHashMap(){
    }

    SHashMap(int size){
        node = new Node[size];
    }

    public void put(K k,V v){
        if (node == null) {
            node = new Node[default_size];
        }
        int hashcode = k.hashCode();
        Node addNode = new Node(k,v,null);
        if (node[hashcode%default_size] == null) {
            node[hashcode%default_size] = addNode;
        } else {
            Node currentNode = node[hashcode%default_size];
            for (;currentNode != null;currentNode = currentNode.next) {
                if (currentNode.getK().equals(k)) {
                    addNode.next = node[hashcode%default_size].next;
                    node[hashcode%default_size] = addNode;
                    break;
                }
                if (currentNode.next == null) {
                    currentNode.next = addNode;
                    break;
                }
            }

        }

    }

    public V get(K k){
        if (node == null || k == null) {
            return null;
        }
        int hashcode = k.hashCode();
        Node temp = node[hashcode%default_size];
        for(int i = 0;temp != null;temp = temp.next){
            if (temp.getK().equals(k)) {
                return (V) temp.getV();
            }
        }
        return null;
    }

    static class Node<K,V>{
        K k;
        V v;
        int hashcode;
        Node next;
        Node(K k,V v, Node next){
            this.k = k;
            this.v = v;
            this.next = next;
        }

        public K getK() {
            return k;
        }

        public void setK(K k) {
            this.k = k;
        }

        public V getV() {
            return v;
        }

        public void setV(V v) {
            this.v = v;
        }

        public int getHashcode() {
            return hashcode;
        }

        public void setHashcode(int hashcode) {
            this.hashcode = hashcode;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
