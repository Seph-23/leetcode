package greedy.leetcode376;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WiggleSubsequence {

  public static void main(String[] args) {
//        int[] nums = {1, 7, 4, 9, 2, 5};
//        int[] nums = {1, 17, 5, 10, 13, 15, 10, 5, 16, 8};
//        int[] nums = {0, 0};
//        int[] nums = {3,3,3,2,5};
    int[] nums = {33, 53, 12, 64, 50, 41, 45, 21, 97, 35, 47, 92, 39, 0, 93, 55, 40, 46, 69,
        42, 6, 95, 51, 68, 72, 9, 32, 84, 34, 64, 6, 2, 26, 98, 3, 43, 30, 60, 3, 68, 82,
        9, 97, 19, 27, 98, 99, 4, 30, 96, 37, 9, 78, 43, 64, 4, 65, 30, 84, 90, 87, 64, 18,
        50, 60, 1, 40, 32, 48, 50, 76, 100, 57, 29, 63, 53, 46, 57, 93, 98, 42, 80, 82, 9,
        41, 55, 69, 84, 82, 79, 30, 79, 18, 97, 67, 23, 52, 38, 74, 15};
//        int[] nums = {0, 0, 0};
    int ans = wiggleMaxLength(nums);
    System.out.println(ans);
  }

  static int wiggleMaxLength(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    int count = 1;
    int prevDiff = 0;
    for (int i = 1; i < nums.length; i++) {
      int diff = nums[i] - nums[i - 1];
      if ((diff > 0 && prevDiff <= 0) || (diff < 0 && prevDiff >= 0)) {
        count++;
        prevDiff = diff;
      }
    }
    return count;
  }
}