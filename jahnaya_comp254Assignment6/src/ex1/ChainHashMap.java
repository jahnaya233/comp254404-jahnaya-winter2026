package ex1;
import java.util.LinkedList;
import java.util.Map;

public class ChainHashMap<K,V> extends  AbstractHashMap<K,V> {


    private LinkedList<Entry<K,V>>[] table;

    public ChainHashMap(int cap, double loadFactor) {
        super (cap, loadFactor);
    }

public ChainHashMap() {
    super();
}

protected void createTable() {
    table = (LinkedList<Entry<K,V>>[]) new LinkedList[capacity];
}

protected V bucketGet(int h, K k) {
    LinkedList<Entry<K,V>> bucket = table[h];
    if  (bucket == null) return null;

    for (Entry<K,V> e : bucket)
        if (e.key.equals(k))
            return e.value;

    return null;
}

protected V bucketPut(int h, K k, V v) {
    if(table[h] == null)
        table[h] = new LinkedList<>();

    for(Entry<K,V> e : table[h]){
        if (e.key.equals(k)) {
            V old = e.value;
            e.value = v;
            return old;
        }
    }

    table[h].add(new Entry<>(k,v));
    n++;
    return null;
}

protected V bucketRemove(int h, K k) {
    LinkedList<Entry<K,V>> bucket = table[h];
    if(bucket == null) return null;

    for(Entry<K,V> e: bucket) {
        if(e.key.equals(k)) {
            V val = e.value;
            bucket.remove(e);
            n--;
            return val;
        }
    }

    return null;
}
protected void resize(int newCap) {
    LinkedList<Entry<K,V>>[] old = table;
    capacity = newCap;
    createTable();
    n =0;

    for(LinkedList<Entry<K,V>> bucket : old) {
        if(bucket != null) {
            for(Entry<K,V> e: bucket) {
                put(e.key, e.value);

            }
        }
    }
}

private static class Entry<K,V> {
    K key;
    V value;
    Entry(K k, V v) {
        key = k;
        value = v;
    }
}}