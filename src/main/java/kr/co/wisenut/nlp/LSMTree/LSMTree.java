package kr.co.wisenut.nlp.LSMTree;

import java.util.HashMap;

/**
 * Created by lleejong on 2017-05-18.
 */
public class LSMTree<K, V> {
    
    private int blockSize = 1000;
    private long nextEmpty = 0;
    
    int k = 2; // lsm tree dimension k
    
    
    private Node block[];
    private String disk = "disk_storage";
    boolean sorted = false;
    
    private class Node<K, V> {
        private K key;
        private V value;
        
        private Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
        
        private K getKey() {
            return this.key;
        }
        
        private V getValue() {
            return this.value;
        }
    }
    
    public LSMTree() {
    }
    
    public LSMTree(boolean sorted) {
        this.sorted = sorted;
    }
    
    public LSMTree(int blockSize) {
        this.blockSize = blockSize;
    }
    
    public LSMTree(int blockSize, boolean sorted) {
        this.blockSize = blockSize;
        this.sorted = sorted;
    }
    
    private void init() {
        block = new Node[this.blockSize];
    }
    
    
    public void put(K k, V v) {
    
    }
    
    public void delete(K k) {
    
    }
    
    public static void main(String args[]) {
        LSMTree<String, Integer> lsmTree = new LSMTree<String, Integer>();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
    }
}
