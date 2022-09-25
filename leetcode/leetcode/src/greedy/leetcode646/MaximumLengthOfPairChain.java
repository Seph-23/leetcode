package greedy.leetcode646;

import java.util.Arrays;

public class MaximumLengthOfPairChain {

    public static void main(String[] args) {
        int[][] pairs = {{1, 2}, {2, 3}, {3, 4}};
        System.out.println(findLongestChain(pairs));
    }

    static int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> a[1] - b[1]);
        int count = 0, i = 0, n = pairs.length;
        while (i < n) {
            count++;
            int curEnd = pairs[i][1];
            while (i < n && pairs[i][0] <= curEnd) i++;
        }
        return count;
    }
}
