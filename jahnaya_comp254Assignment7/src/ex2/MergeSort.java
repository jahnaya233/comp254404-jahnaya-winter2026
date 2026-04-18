package ex2;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class MergeSort {

    public static <K> Queue<K> merge(Queue<K> Q1, Queue<K> Q2, Comparator<K> comp) {
        Queue<K> result = new LinkedList<>();

        while(!Q1.isEmpty() && !Q2.isEmpty()) {
            if(comp.compare(Q1.peek(), Q2.peek()) < 0)
                result.add(Q1.poll());
            else
                result.add(Q2.poll());
        }

        while(!Q1.isEmpty())
            result.add(Q1.poll());
        while(!Q2.isEmpty())
            result.add(Q2.poll());

        return result;

    }

    public static <K> Queue<K> mergeSort(Queue<K> data, Comparator<K> comp) {
        Queue<Queue<K>> queueOfQueues = new LinkedList<>();

        while(!data.isEmpty()) {
            Queue<K> single = new LinkedList<>();
            single.add(data.poll());
            queueOfQueues.add(single);
        }

        while(queueOfQueues.size() > 1) {
            Queue<K> q1 = queueOfQueues.poll();
            Queue<K> q2 = queueOfQueues.poll();
            queueOfQueues.add(merge(q1,q2, comp));

        }

        return queueOfQueues.poll();
    }

}
