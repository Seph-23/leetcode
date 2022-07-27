package greedy.leetcode561;

import java.util.Arrays;

public class SolutionArrayPartition {

  public static void main(String[] args) {
    int[] nums = {6, 2, 6, 5, 1, 2};
    int ans = arrayPairSum(nums);
    System.out.println(ans);
  }

  static int arrayPairSum(int[] nums) {
    int sum = 0;
    Arrays.sort(nums);
    for (int i = 0; i < nums.length; i += 2) {
      sum += Math.min(nums[i], nums[i + 1]);
    }
    return sum;
  }
}
