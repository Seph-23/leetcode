package greedy.leetcode870;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * 람다, PriorityQueue
 */
public class AdvantageShuffle {
    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        int[] nums2 = {1, 10, 4, 11};

        int[] ans = advantageCount(nums1, nums2);
        System.out.println(Arrays.toString(ans));
    }

    static int[] advantageCount(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);                 //nums1 sorted in asc. order
        int length = nums1.length;          //length of arrays
        int[] ans = new int[length];        //store answer, Advantage shuffle (of nums1).

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);       //PriorityQueue in desc. order.

        for (int i = 0; i < length; i++) {
            pq.add(new int[]{nums2[i], i});
        }

        int low = 0, high = length-1;
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int index=curr[1], val=curr[0];

            if (nums1[high] > val) {
                ans[index] = nums1[high--];
            }else{
                ans[index] = nums1[low++];
            }
        }

        return ans;
    }
}
