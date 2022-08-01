package greedy.leetcode435;

import java.util.Arrays;

/**
 * Done
 */
public class NonOverlappingIntervals {

  public static void main(String[] args) {
//    int[][] intervals = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
//    int[][] intervals = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
    int[][] intervals = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
    System.out.println(eraseOverlapIntervals(intervals));
  }

  static int eraseOverlapIntervals(int[][] intervals) {
    if (intervals == null || intervals.length == 0) {
      return 0;
    }
    //sorts intervals in ascending order comparing 2nd element of
    //each array inside intervals
    Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

    int k = 0;     //index one loop before, i is current index of the loop.
    int count = 1;     //# of arrays that are not overlapping.
    int n = intervals.length;   //# of arrays inside intervals.
    for (int i = 1; i < n; i++) {
      if (intervals[i][0] >= intervals[k][1]) {
        k = i;        //saving current index for next iteration.
        count++;
      }
    }
    return n-count;     //return (total arrays - # of arrays not overlapping).
  }
}
