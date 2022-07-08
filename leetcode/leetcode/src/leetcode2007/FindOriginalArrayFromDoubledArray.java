package leetcode2007;

/**
 * 아직 못 풀었음!!!
 */
public class FindOriginalArrayFromDoubledArray {
    public static void main(String[] args) {
//        int[] changed = {1, 3, 4, 2, 6, 8};
        int[] changed = {3, 1};

        int[] original = new int[changed.length / 2];
        original = findOriginalArray(changed);
        for (int i = 0; i < original.length; i++) {
            System.out.println(original[i]);
        }
    }

    static int[] findOriginalArray(int[] changed) {
        int[] ans = new int[changed.length / 2];
        int count = 0;

        for (int i = 0, j = changed.length / 2; i < changed.length / 2; i++, j++) {
            if (changed[i] * 2 == changed[j]) {
                ans[i] = changed[i];
                count++;
            }else if((double)changed[i]/2.0 == (double)changed[j]){
                ans[i] = changed[j];
                count++;
            }
        }

        if (count == changed.length / 2) {
            return ans;
        }else{
            int[] empty = {};
            return empty;
        }
    }
}