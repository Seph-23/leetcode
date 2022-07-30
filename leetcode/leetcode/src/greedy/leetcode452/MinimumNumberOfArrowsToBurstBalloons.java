package greedy.leetcode452;

import java.util.Arrays;

public class MinimumNumberOfArrowsToBurstBalloons {

  public static void main(String[] args) {
    int[][] points = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
//    int[][] points = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
    System.out.println(findMinArrowShots(points));
  }

  static int findMinArrowShots(int[][] points) {
    if (points == null || points.length == 0 || points[0].length == 0) {      //corner case
      return 0;
    }

    Arrays.sort(points, (a, b) -> a[0] - b[0] == 0 ? a[1] - b[1] : a[0] - b[0]);

    int index = 0 , result = 0;

    while (index < points.length) {
      int end = points[index][1];
      while (index + 1 < points.length) {
        if (end >= points[index + 1][0]) {
          end = Math.min(end, points[index + 1][1]);
          index++;
        }else {
          break;
        }
        result++;
        index++;
      }
    }
    return result;
  }
}
