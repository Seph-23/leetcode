package greedy.leetcode179;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
    public static void main(String[] args) {
        int[] nums = {3, 30, 34, 5, 9};
        String ans = largestNumber(nums);
        System.out.println(ans);
    }


    static String largestNumber(int[] nums) {
        String[] ans = new String[nums.length];
        String answer = "";

        for (int i = 0; i < nums.length; i++) {
            ans[i] = Integer.toString(nums[i]);             //both works but toString will throw NPE when the array is null.
            //ans[i] = String.valueOf(nums[i]);
        }

        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1 + o2;
                String s2 = o2 + o1;
                return s2.compareTo(s1);
            }
        };

        Arrays.sort(ans, comp);

        if (ans[0].equals("0")) {
            return "0";
        }

        for (String a : ans) {
            answer += a;
        }

        return answer;
    }
}
