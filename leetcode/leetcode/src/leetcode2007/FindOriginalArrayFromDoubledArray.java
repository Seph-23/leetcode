package leetcode2007;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 아직 못 풀었음!!!
 */
public class FindOriginalArrayFromDoubledArray {
    public static void main(String[] args) {
//        int[] changed = {1, 3, 4, 2, 6, 8};       // 1 2 3 4 6 8
//        int[] changed = {3, 1};
//        int[] changed = {0, 3, 2, 4, 6, 0}; //0 0 2 3 4 6
//        int[] changed = {2, 1};
        int[] changed = {1};

        changed = findOriginalArray(changed);
        for (int a : changed) {
            System.out.println(a);
        }
    }

    static int[] findOriginalArray(int[] changed) {
        if (changed.length % 2 != 0) {      //If Array has odd number of element return empty array.
            return new int[0];
        }

        Arrays.sort(changed);
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : changed) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            System.out.println(map.get(num));
        }

        return new int[0];
    }
}