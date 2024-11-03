import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
public class PQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap.add(12);
        minHeap.add(13);
        minHeap.add(11);
        minHeap.add(9);
        minHeap.add(15);
        System.out.println(minHeap);
        System.out.println(minHeap.remove());
        System.out.println(minHeap);
    }
}
