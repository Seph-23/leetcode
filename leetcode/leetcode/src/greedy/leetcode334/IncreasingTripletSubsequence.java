package greedy.leetcode334;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Not Done!
 */
public class IncreasingTripletSubsequence {

  public static void main(String[] args) {
//    int[] nums = {1, 2, 3, 4, 5};
//    int[] nums = {5, 4, 3, 2, 1};
//    int[] nums = {2, 1, 5, 0, 4, 6};
//    int[] nums = {20, 100, 10, 12, 5, 13};
    int[] nums = {1, 2, 1, 3};        //key 에다가 nums 값을 넣으면 key 는 유니크이기 때문에 문제가 발생.
    System.out.println(increasingTriplet(nums));
  }

  static boolean increasingTriplet(int[] nums) {
    int length = nums.length;
    int count = 1;

    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < length; i++) {
      map.put(i, nums[i]);
    }
//    System.out.println(map.toString());
    Arrays.sort(nums);
    for (int i = 0; i < length-1; i++) {
      int a = map.get(nums[i]);
      int b = map.get(nums[i + 1]);
      if (a < b && nums[i] < nums[i + 1]) {
        count++;
      }
    }
    if (count >= 3) {
      return true;
    }
    return false;
  }
}
