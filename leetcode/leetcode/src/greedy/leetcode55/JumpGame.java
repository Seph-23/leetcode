package greedy.leetcode55;

public class JumpGame {

  public static void main(String[] args) {
    int[] nums = {3, 0, 0, 0, 5, 0, 0, 0, 0, 4};
    boolean ans = canJump(nums);
    System.out.println(ans);
  }

  static boolean canJump(int[] nums) {
    int max = 0;
    for (int i = 0; i < nums.length; i++) {
      if (i > max) {
        return false;
      }
      max = Math.max(max, i + nums[i]);
    }
    return true;        //if iteration runs until the end of the array return true.
  }
}
