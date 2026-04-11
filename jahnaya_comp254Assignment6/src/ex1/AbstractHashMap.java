package ex1;
import java.util.ArrayList;
public abstract class AbstractHashMap<K,V> {

    protected int n = 0;
    protected int capacity;
    protected double maxLoadFactor;

    public AbstractHashMap(int cap, double loadFactor) {
        capacity = cap;
        maxLoadFactor = loadFactor;
        createTable();
    }

    public AbstractHashMap() {
        this(11, 0.5);
    }
public int size() {
        return n;
}

public V get(K key) {
        return bucketGet(hashValue(key), key);
}

public V put(K key, V value) {
        V answer = bucketPut(hashValue(key), key, value);
        if(n > capacity * maxLoadFactor)
            resize(2 * capacity);
        return answer;
}

public V remove (K key) {
        return bucketRemove(hashValue(key), key);
}

private int hashValue(K key) {
        return Math.abs(key.hashCode()) % capacity;
}

protected abstract void createTable();
    protected abstract V bucketGet(int h, K k);
    protected abstract V bucketPut(int h, K k, V v);
    protected abstract V bucketRemove(int h, K k);
    protected abstract void resize(int newCap);
}