package ex3;
import java.util.ArrayList;

public class Upheap<K extends  Comparable<K>, V> {
    protected static class Entry<K,V> {

        private K key;
        private V value;

        public Entry(K k, V v) {
            key = k;
            value = v;

        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
    protected ArrayList<Entry<K,V>> heap = new ArrayList<>();
    protected  int parent(int j) {
        return (j -1) /2;
    }
    protected void swap(int i, int j) {
        Entry<K,V> temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j,temp);
    }

    protected int compare(Entry<K,V> a, Entry<K,V> b) {
        return a.getKey().compareTo(b.getKey());
    }

    protected void upheap(int j) {
        if (j ==0 ) return;

        int p = parent(j);

        if(compare(heap.get(j), heap.get(p)) <0) {
            swap(j,p);
            upheap(p);
        }
    }

    public void insert(K key, V value) {
        heap.add(new Entry<>(key, value));
        upheap(heap.size() - 1);
    }
}


