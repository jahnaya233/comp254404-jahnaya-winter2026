package ex1;

import java.util.Map;

public class ProbeHashMap<K,V> extends AbstractHashMap<K,V> {
private Entry<K,V>[] table;
private Entry<K,V> DEFUNCT = new Entry<>(null, null);

public ProbeHashMap(int cap, double loadFactor){
    super(cap, loadFactor);
}
public ProbeHashMap(){
    super();
}

protected void createTable() {
    table = (Entry <K,V>[]) new Map.Entry[capacity];
}
private int findSlot(int h, K k) {
    int avail = -1;
    int j =h;
    do {
        if (table[j] == null) {
            if (avail < 0) avail = j;
            break;
        } else if (table[j] == DEFUNCT) {
            if (avail < 0) avail = j;
        } else if (table[j].key.equals(k)) {
            return j;
        }

        j = (j + 1) % capacity;
    } while(j != h);
    return -(avail + 1);

    }

    protected V bucketGet(int h, K k) {
    int j = findSlot(h, k);
    if(j >=0) return table[j].value;
    return null;
}

protected  V bucketPut(int h, K k, V v) {
    int j = findSlot(h, k);

    if (j>=0) {
        V old = table[j].value;
        table[j].value = v;
        return old;
    }
    table[-(j +1)] = new Entry<>(k, v);
    n++;
    return null;
}

protected V bucketRemove(int h, K k) {
    int j = findSlot(h, k);
    if(j <0) return null;

    V val = table[j].value;
    table[j] = DEFUNCT;
    n--;
    return  val;
}
protected void resize(int newCap) {
    Entry<K,V>[] old = table;
    capacity = newCap;
    createTable();
    n = 0;

    for (Entry<K,V> e : old) {
        if (e != null && e != DEFUNCT)
            put(e.key, e.value);
    }
}

private static class Entry<K,V> {
    K key;
    V value;
    Entry(K k, V v) {
        key = k;
        value = v;
    }
}
}
