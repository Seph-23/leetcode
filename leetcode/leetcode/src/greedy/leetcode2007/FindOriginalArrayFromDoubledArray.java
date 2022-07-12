package greedy.leetcode2007;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindOriginalArrayFromDoubledArray {
    public static void main(String[] args) {
//        int[] changed = {1, 3, 4, 2, 6, 8};       // 1 2 3 4 6 8
//        int[] changed = {3, 1};
        int[] changed = {0, 3, 2, 4, 6, 0}; //0 0 2 3 4 6
//        int[] changed = {2, 1};
//        int[] changed = {1};

        changed = findOriginalArray(changed);
        for (int a : changed) {
            System.out.println(a);
        }
    }

    static int[] findOriginalArray(int[] changed) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[changed.length / 2];
        int pointer = 0;

        if (changed.length % 2 != 0) {      //If Array has odd number of element return empty array.
            return new int[0];
        }

        Arrays.sort(changed);

        for (int num : changed) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : changed) {
            if (map.get(num) < 1) {
                continue;
            }
            if (map.getOrDefault(num * 2, 0) < 1) {
                return new int[0];
            }

            map.put(num, map.get(num) - 1);
            map.put(num * 2, map.get(num * 2) - 1);
            res[pointer++] = num;
        }
        return res;
    }
}