package greedy.leetcode502;

import java.util.PriorityQueue;


/**
 * 공부 좀 더 하자!!
 */
public class Ipo {
    public static void main(String[] args) {
        //design the best way to maximize its total capital after finishing at most
        int k = 3;                    // k distinct projects.
        int w = 0;                    // Initial number of capital.
        int[] profits = {1, 2, 3};
        int[] capital = {0, 1, 2};

        int maxCapital = findMaximizedCapital(k, w, profits, capital);
        System.out.println(maxCapital);
    }
    static int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        //Declaration, both PriorityQueue are null.
        PriorityQueue<int[]> pqCap = new PriorityQueue<>((a, b) -> (a[0] - b[0]));
        PriorityQueue<int[]> pqPro = new PriorityQueue<>((a, b) -> (b[1] - a[1]));

        for (int i = 0; i < profits.length; i++) {
            pqCap.add(new int[] {capital[i], profits[i]});
        }

        for (int i = 0; i < k; i++) {
            while (!pqCap.isEmpty() && pqCap.peek()[0] <= w) {
                pqPro.add(pqCap.poll());
            }
            if (pqPro.isEmpty()) {
                break;
            }
            w += pqPro.poll()[1];
        }
        return w;
    }
}
