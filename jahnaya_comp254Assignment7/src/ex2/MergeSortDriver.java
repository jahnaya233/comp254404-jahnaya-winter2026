package ex2;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

import static ex2.MergeSort.mergeSort;

public class MergeSortDriver {

    public static void main(String[] args) {
        Queue<Integer> data = new LinkedList<>();
        data.add(85);
        data.add(12);
        data.add(68);
        data.add(41);

        Comparator<Integer> comp = new Comparator<Integer>() {
        public int compare(Integer a, Integer b) {
            return a.compareTo(b);
        }
        };
        Queue<Integer> sorted = mergeSort(data, comp);

        while(!sorted.isEmpty())
            System.out.println(sorted.poll());


    }
}
