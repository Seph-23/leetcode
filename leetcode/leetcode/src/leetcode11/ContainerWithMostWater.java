package leetcode11;

import java.util.Arrays;

public class ContainerWithMostWater {
    public static void main(String[] args) {
//        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
//        int[] height = {1, 1};
        int[] height = {2, 3, 4, 5, 18, 17, 6};
        int maxArea = maxArea(height);
        System.out.println(maxArea);
    }

    static int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0, right = height.length-1;

        while (left < right) {
            maxArea = Math.max(maxArea, (right - left) * Math.min(height[left], height[right]));

            if (height[left] < height[right]) {
                left++;
            }else {
                right--;
            }
        }

        return maxArea;
    }
}