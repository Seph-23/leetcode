package greedy.leetcode452;

import java.util.Arrays;

/**
 * Done
 */
public class MinimumNumberOfArrowsToBurstBalloons {

  public static void main(String[] args) {
    int[][] points = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
//    int[][] points = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
    System.out.println(findMinArrowShots(points));
  }

  static int findMinArrowShots(int[][] points) {
    Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
    int ans = 0, arrow = 0;
    for (int i = 0; i < points.length; i++) {
      if (ans == 0 || points[i][0] > arrow) {
        ans++;
        arrow = points[i][1];
      }
    }
    return ans;
  }
}