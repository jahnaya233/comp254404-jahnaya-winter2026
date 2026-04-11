package ex2;

import java.util.ArrayList;

public class SortedTableMap<K extends Comparable<K>,V> {

private ArrayList<Entry<K,V>> table = new ArrayList<>();

public int size() {
    return table.size();
}

public V get(K key) {
    int j = findIndex(key, 0, size() -1);
    if(j == size() || !table.get(j).key.equals(key))
        return null;
    return table.get(j).value;
}

public V put(K key, V value) {
    int j = findIndex(key, 0, size() -1);

    if(j < size() && table.get(j).key.equals(key)) {
        V old = table.get(j).value;
        table.get(j).value = value;
        return old;
    }
    table.add(j, new Entry<>(key, value));
    return null;
}

public V remove(K key) {
int j = findIndex(key,0, size() -1);

if (j ==size() || !table.get(j).key.equals(key))
return null;

return table.remove(j).value;

}

public boolean containsKey(K key) {
    int j = findIndex(key,0,size() -1);
    if(j < size() && table.get(j).key.equals(key))
        return true;
    return false;
}
private int findIndex(K key, int low, int high) {
    if(high < low) return low;

    int mid = (low+high) /2;
    int comp = key.compareTo(table.get(mid).key);

    if(comp == 0) return mid;
    else if (comp < 0)
        return findIndex(key, low, mid -1);
    else return findIndex(key,mid +1, high);
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