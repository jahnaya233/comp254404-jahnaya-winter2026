package ex3;
import java.util.ArrayList;

public class UpheapDriver {

    public static void main(String[] args) {
        Upheap<Integer, String> pq = new Upheap<>();

        pq.insert(47, "A");
        pq.insert(75, "C");
        pq.insert(28, "B");
        pq.insert(51, "D");
        pq.insert(31, "F");

        for (Upheap.Entry<Integer, String> e: pq.heap) {
    System.out.println(e.getKey() + ", " + e.getValue());
        }
    }

}


