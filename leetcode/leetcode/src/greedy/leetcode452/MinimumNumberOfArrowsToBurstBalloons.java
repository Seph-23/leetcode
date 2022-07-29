package greedy.leetcode452;

import java.util.Arrays;

/**
 * not solved yet!!
 */
public class MinimumNumberOfArrowsToBurstBalloons {

  public static void main(String[] args) {
    int[][] points = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
//    int[][] points = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
    System.out.println(findMinArrowShots(points));
  }

  static int findMinArrowShots(int[][] points) {
    //sorts intervals in ascending order comparing 2nd element of
    //each array inside intervals
    Arrays.sort(points, (a, b) -> a[1] - b[1]);

    int k = 0;
    int count = 0;
    int n = points.length;
    for (int i = 1; i < n; i++) {
      if (points[i][0] >= points[k][1]) {
        k = ++i;
        count++;        //# of arrays not overlapping
      }
    }

    return count;
  }
}
