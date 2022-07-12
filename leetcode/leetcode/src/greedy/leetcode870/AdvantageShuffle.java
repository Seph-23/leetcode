package greedy.leetcode870;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 아직 풀어야됨!
 */
public class AdvantageShuffle {
    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        int[] nums2 = {1, 10, 4, 11};

        int[] ans = advantageCount(nums1, nums2);
        System.out.println(ans.toString());
    }

    static int[] advantageCount(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        int[] tempNums2 = new int[nums2.length];

        for (int i = 0; i < nums2.length; i++) {
            tempNums2[i] = nums2[i];
        }

        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], nums2[i]);
        }

        return ans;
    }
}
