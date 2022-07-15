import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Practice {
    public static void main(String[] args) {
        int[] c = {1, 3, 2, 4, 3, 5};
        int[] d = {9, 7, 8, 6, 7, 5};

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> a - b);

        for (int i = 0; i < c.length; i++) {
            pq.add(c[i]);
        }
        System.out.println(pq.poll());
    }
}
