package greedy.leetcode334;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Done!
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
    if (nums == null || nums.length < 3) {
      return false;
    }
    Integer num1 = nums[0], num2 = null;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] <= num1) {
        num1 = nums[i];
      }else {
        if (num2 != null && nums[i] > num2) {
          return true;
        }
        num2 = nums[i];
      }
    }
    return false;
  }
}
